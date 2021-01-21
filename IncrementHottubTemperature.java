
public class IncrementHottubTemperature implements Command {
    
    Hottub hottub;

    public IncrementHottubTemperature(Hottub hottub) {
    
        this.hottub = hottub;
    
    }

    public void execute() {
    
        hottub.incrementTemperature();
    
    }

    public void undo() {
    
        hottub.decrementTemperature();
    
    }

    public String display() {
    
        return this.getClass().getName();
    
    }

}
