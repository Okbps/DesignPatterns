package com.ch06Command;

public class RemoteLoader {
	public static void main(String[] args) {
	    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

	    Light livingRoomLight = new Light("Living Room");
	    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
	    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

	    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

	    remoteControl.buttonOnPressed(0);
	    remoteControl.buttonOffPressed(0);
        remoteControl.buttonUndoPressed();
	    remoteControl.buttonOnPressed(1);
	    remoteControl.buttonOffPressed(1);
    }
}
