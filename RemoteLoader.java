public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();
        DisplayLog display = new DisplayLog(remoteControl);
        NoCommand noCom = new NoCommand();
        
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);

        HottubOnCommand hottubOn =
                new HottubOnCommand(hottub);
        HottubOffCommand hottubOff =
                new HottubOffCommand(hottub);
        
        IncrementHottubTemperature incTemp =
                new IncrementHottubTemperature(hottub);
        DecrementHottubTemperature decTemp =
                new DecrementHottubTemperature(hottub);
        
        Command[] partyOn = {hottubOn, livingRoomLightOn, kitchenLightOn, stereoOnWithCD};
        Command[] partyOff = {hottubOff, livingRoomLightOff, kitchenLightOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, hottubOn, hottubOff);
        remoteControl.setCommand(5, incTemp, decTemp);
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
        remoteControl.setCommand(7, noCom, display);

		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed(); // undo	
        remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed(); // undo
        remoteControl.offButtonWasPushed(1);	
        remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	    remoteControl.onButtonWasPushed(4);
 		remoteControl.onButtonWasPushed(5);
        remoteControl.undoButtonWasPushed(); // undo
        remoteControl.undoButtonWasPushed(); // undo
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.offButtonWasPushed(4);
        remoteControl.offButtonWasPushed(7);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);

    }
}
