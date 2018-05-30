import java.util.Random;

public class U1 extends Rocket {



    public U1(int cost, int weight, int maxWeight) {
        super(cost, weight, maxWeight);
    }


    @Override
    public boolean launch() {

        int chanceExplosion = 5 * (getWeight()/getMaxWeight());

        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;

        if(chanceExplosion < randomInt){

            return true;

        }else{

            return false;
        }


    }

    @Override
    public boolean land() {

        int chanceCrash= 1 * (getWeight()/getMaxWeight());

        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;

        if(chanceCrash < randomInt){

            return true;

        }else{

            return false;
        }
    }
}
