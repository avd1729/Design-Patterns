package factory;

public class CoffeeFactory {
    public CoffeeFactory() {
    }

    public Coffee factory(Coffee coffee) {
        if(coffee.description.equals("Expresso")){
            return new Expresso();
        }
        throw new IllegalArgumentException("Invalid coffee description");
    }
}
