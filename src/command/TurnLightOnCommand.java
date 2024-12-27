package command;

public class TurnLightOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Turn Light On");
    }

    @Override
    public void undo() {
        System.out.println("Turn Light Off");
    }
}
