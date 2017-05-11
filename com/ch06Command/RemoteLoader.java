package com.ch06Command;

public class RemoteLoader {
	public static void main(String[] args) {
	    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

	    Light livingRoomLight = new Light("Living Room");
	    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
	    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

	    CeilingFan ceilingFan = new CeilingFan("Living Room");
	    CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
	    CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
	    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

	    Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        HotTub hottub = new HotTub();

        LightDimCommand lightDim = new LightDimCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TvOnCommand tvOn = new TvOnCommand(tv);
        HotTubOnCommand hottubOn = new HotTubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TvOffCommand tvOff = new TvOffCommand(tv);
        HotTubOffCommand hottubOff = new HotTubOffCommand(hottub);

        Command[] partyOn = { lightDim, stereoOn, tvOn, hottubOn};
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);


	    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
	    remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
	    remoteControl.setCommand(2, ceilingFanMedium, ceilingFanOff);
	    remoteControl.setCommand(3, partyOnMacro, partyOffMacro);

	    remoteControl.buttonOnPressed(0);
	    remoteControl.buttonOffPressed(0);
        remoteControl.buttonUndoPressed();

	    remoteControl.buttonOnPressed(1);
	    remoteControl.buttonOffPressed(1);
        remoteControl.buttonUndoPressed();

	    remoteControl.buttonOnPressed(2);
	    remoteControl.buttonOffPressed(2);
        remoteControl.buttonUndoPressed();

        System.out.println("------Get the party started------");
        remoteControl.buttonOnPressed(3);
        System.out.println("------Get the party finished------");
        remoteControl.buttonOffPressed(3);
        System.out.println("------Undo finish------");
        remoteControl.buttonUndoPressed();
    }
}
