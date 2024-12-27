package command;

public class Remote {
    static Light light = new Light();
    public static void main(String[] args) {
        light.on();
        light.off();
    }
}
