package mvc;

public class Observer {

    double temperature;
    double humidity;

    public void update(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
