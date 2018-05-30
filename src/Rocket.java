public class Rocket implements SpaceShip{

    private int cost;
    private int weight;
    private int maxWeight;

    public Rocket(int cost, int weight, int maxWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {

        int currentWeight = weight + item.getWeight();
        if(currentWeight < maxWeight){

            return true;
        }else{

            return false;
        }

    }

    @Override
    public void carry(Item item) {

        weight += item.getWeight();

    }
}
