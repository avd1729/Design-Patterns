package command;

public class TurnLightOffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("turn off");
    }


    @Override
    public void undo() {
        System.out.println("turn on");
    }
}
