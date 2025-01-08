package mvc;

public class Main {
    public static void main(String[] args) {
        Observable model = new Model(12.0, 15.0);
        Observer view1 = new CurrentConditionView();
        model.register(view1);
        model.notifyObservers();

        Observer view2 = new StatisticsConditionView(new FirstStrategy());
        model.register(view2);
        model.notifyObservers();

        model.remove(view2);
        StatisticsConditionView view3 = new StatisticsConditionView(new FirstStrategy());
        view3.setStrategy(new SecondStrategy());

        model.register(view3);
        model.notifyObservers();

    }

}
