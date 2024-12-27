package command;

public class Light {
    private TurnLightOnCommand lightOnCommand = new TurnLightOnCommand();
    private TurnLightOffCommand lightOffCommand = new TurnLightOffCommand();

    public Light (){}

    public void on(){
        lightOnCommand.execute();
    }

    public void off(){
        lightOffCommand.execute();
    }
}
