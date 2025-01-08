package mvc;

public class StatisticsConditionView extends Observer{

    Strategy strategy;

    public StatisticsConditionView(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    @Override
    public void update(double temperature, double humidity) {
        super.update(temperature, humidity);
        display();
    }

    public void display() {
        strategy.calculate();
    }
}
