package com.ch06Command;

/**
 * Created by Aspire on 04.05.2017.
 */
public class StereoOnCommand implements Command{
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
