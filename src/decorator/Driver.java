package decorator;

public class Driver {
    public static void main(String[] args) {
        Coffee coffee = new Expresso();
        System.out.println(coffee.getCost());
        Coffee milkCoffee = new MilkDecorator(new MilkDecorator(coffee));
        System.out.println(milkCoffee.getCost());
    }
}
