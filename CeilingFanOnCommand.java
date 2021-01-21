public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
    public void undo() {
    
        ceilingFan.off();
    
    }
    public String display() {
    
        return this.getClass().getName();
    
    }

}