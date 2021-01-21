import java.util.*;

//
// This is the invoker
//
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
    ArrayList<Command> commandsLog;
    //Command undoCommand = new NoCommand();
    int indexUndo = 0;
     
	public RemoteControl() {
		onCommands = new Command[8];
		offCommands = new Command[8];
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < 8; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		
        commandsLog = new ArrayList<>();
        }
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	    //undoCommand = onCommands[slot];
        commandsLog.add(onCommands[slot]);
        indexUndo++;
    }
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	    //undoCommand = offCommands[slot];
        commandsLog.add(offCommands[slot]);
        indexUndo++;
    }
    
    public void undoButtonWasPushed() {
        //undoCommand.undo();
        if (indexUndo == 0) {
            return;
        }
        else {
            commandsLog.get(indexUndo - 1).undo();
            commandsLog.add(commandsLog.get(indexUndo - 1));
            indexUndo++;
        }
    }
     
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
