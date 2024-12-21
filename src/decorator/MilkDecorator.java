package decorator;

public class MilkDecorator extends Coffee{

    Coffee coffee;
    public MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription(){
        return "Milk";
    }

    @Override
    public int getCost(){
        return 5 + coffee.getCost();
    }
}
