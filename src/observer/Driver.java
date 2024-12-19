package observer;

public class Driver {
    public static void main(String[] args) {
        Blog blog = new Blog();
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        blog.addObserver(alice);
        blog.addObserver(bob);
        blog.notifyObservers("Hey! ,");
    }
}
