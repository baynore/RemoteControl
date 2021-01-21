
public class DecrementHottubTemperature implements Command {
    
    Hottub hottub;

    public DecrementHottubTemperature(Hottub hottub) {
    
        this.hottub = hottub;
    
    }

    public void execute() {
    
        hottub.decrementTemperature();
        
    }
    
    public void undo() {
    
        hottub.incrementTemperature();
    
    }
    
    public String display() {
    
        return this.getClass().getName();
    
    }
}
