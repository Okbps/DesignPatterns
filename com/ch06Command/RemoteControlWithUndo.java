package com.ch06Command;

/**
 * Created by Aspire on 04.05.2017.
 */
public class RemoteControlWithUndo {
    Command[]onCommands;
    Command[]offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i]= noCommand;
            offCommands[i]= noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command on, Command off) {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void buttonOnPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void buttonOffPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void buttonUndoPressed(){
        undoCommand.undo();
    }
}
