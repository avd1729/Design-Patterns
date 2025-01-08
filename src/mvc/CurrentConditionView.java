package mvc;

public class CurrentConditionView extends Observer{
    @Override
    public void update(double temperature, double humidity) {
        super.update(temperature, humidity);
        display();
    }

    public void display() {
        System.out.println("Current Conditions:");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
    }
}
