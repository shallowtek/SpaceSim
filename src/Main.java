import java.util.ArrayList;

public class Main {


    public static void main(String args[]) throws Exception{

        Simulation sim = new Simulation();

        ArrayList<Item> itemListPhase1 = sim.loadItems("phase1.txt");
        ArrayList<Item> itemListPhase2 = sim.loadItems("phase2.txt");

        ArrayList<Rocket> u1ListPhase1 = sim.loadU1(itemListPhase1);
        ArrayList<Rocket> u1ListPhase2 = sim.loadU1(itemListPhase2);

        ArrayList<Rocket> u2ListPhase1 = sim.loadU2(itemListPhase1);
        ArrayList<Rocket> u2ListPhase2 = sim.loadU2(itemListPhase2);

        System.out.println("Total Rockets in List u1 Phase 1: " + u1ListPhase1.size());
        System.out.println(sim.runSimulation(u1ListPhase1));
        System.out.println("Total Rockets in List u1 Phase 2: " + u1ListPhase2.size());
        System.out.println(sim.runSimulation(u1ListPhase2));

        System.out.println("Total Rockets in List u2 Phase 1: " + u2ListPhase1.size());
        System.out.println(sim.runSimulation(u2ListPhase1));

        System.out.println("Total Rockets in List u2 Phase 2: " + u2ListPhase1.size());
        System.out.println(sim.runSimulation(u2ListPhase2));


    }
}
