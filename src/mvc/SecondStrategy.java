package mvc;

public class SecondStrategy implements Strategy{
    @Override
    public void calculate() {
        System.out.println("Humidity Strategy");
    }
}
