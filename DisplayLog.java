
public class DisplayLog implements Command {

    private RemoteControl remoteControl;

    public DisplayLog(RemoteControl remoteControl) {
    
        this.remoteControl = remoteControl;
    
    }

    public void execute() {
    
        System.out.println("Remote Control's Display Log:");

        for (Command c : remoteControl.commandsLog)
            System.out.println(c.display());
    
    }

    public void undo() { }

    public String display() {return null;}

}
