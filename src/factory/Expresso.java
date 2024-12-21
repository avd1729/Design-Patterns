package factory;


public class Expresso extends Coffee {

    private int cost = 19;
    private String description = "Expresso";
    public Expresso() {
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
