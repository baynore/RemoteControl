public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

    public void undo() {
    
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    
    }

    public String display() {
    
        return this.getClass().getName();
    
    }

}
