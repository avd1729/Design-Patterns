package observer;

public class Subscriber implements Observer {

    private String name;
    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(message + " " + name);
    }
}
