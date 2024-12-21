package factory;

public class Driver {

    public static void main(String[] args) {

        Coffee coffee = new Expresso();
        CoffeeFactory factory = new CoffeeFactory();
        Coffee newCoffee = factory.factory(coffee);
        System.out.println(newCoffee.getDescription());
    }
}
