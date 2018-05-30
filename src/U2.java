import java.util.Random;

public class U2 extends Rocket {


    public U2(int cost, int weight, int maxWeight) {
        super(cost, weight, maxWeight);
    }

    @Override
    public boolean launch() {

        int chanceExplosion = 4 * (getWeight()/getMaxWeight());

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

        int chanceCrash= 8 * (getWeight()/getMaxWeight());

        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;

        if(chanceCrash < randomInt){

            return true;

        }else{

            return false;
        }
    }
}
