package mvc;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable{
    double temperature;
    double humidity;
    List<Observer> observers;

    public Model(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.observers = new ArrayList<>();
    }


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature, humidity);
        }
    }
}
