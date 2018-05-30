import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList<Item> loadItems(String phase) throws Exception{

        File file = new File(phase);
        Scanner scan = new Scanner(file);
        ArrayList<Item> itemList = new ArrayList<Item>();
        while(scan.hasNextLine()){

            String line = scan.nextLine();
            String[] words = line.split("=");
            Item item = new Item(words[0], Integer.parseInt(words[1]));
            itemList.add(item);

        }

        return itemList;

    }//end loadItems


    public int runSimulation(ArrayList<Rocket> rocketList){

        int budget = 0;

        for(Rocket x : rocketList){

            if(x.launch() && x.land()){

                budget += x.getCost();

            }else{

                while(!x.launch() || !x.land()){

                    budget += x.getCost();


                }

            } // end if/else





        }//end for loop

        return budget;
    }//end run simulation


    public ArrayList<Rocket> loadU1(ArrayList<Item> itemList) throws Exception{

        ArrayList<Rocket> u1List = new ArrayList<Rocket>();
        boolean newRocket = false;
        U1 u1 = new U1(100, 10000, 18000);

        for(int i=0; i<itemList.size(); i++){

            if(newRocket){

                u1 = new U1(100, 10000, 18000);

            }


            if(u1.canCarry(itemList.get(i))){

                u1.carry(itemList.get(i));
                newRocket = false;
            }else{

                u1List.add(u1);
                newRocket = true;

            }//end while loop



        }//end for loop


        return u1List;

    }//end loadU1


    public ArrayList<Rocket> loadU2(ArrayList<Item> itemList) throws Exception{

        ArrayList<Rocket> u2List = new ArrayList<Rocket>();
        boolean newRocket = false;
        U2 u2 = new U2(120, 18000, 29000);

        for(int i=0; i<itemList.size(); i++){

            if(newRocket){

                u2 = new U2(120, 18000, 29000);

            }


            if(u2.canCarry(itemList.get(i))){

                u2.carry(itemList.get(i));
                newRocket = false;
            }else{

                u2List.add(u2);
                newRocket = true;

            }//end while loop



        }//end for loop


        return u2List;

    }//end loadU2
}//end class
