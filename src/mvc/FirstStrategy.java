package mvc;

public class FirstStrategy implements Strategy{
    @Override
    public void calculate() {
        System.out.println("Temperature Strategy");
    }
}
