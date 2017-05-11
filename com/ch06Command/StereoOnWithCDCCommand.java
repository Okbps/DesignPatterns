package com.ch06Command;

/**
 * Created by Aspire on 04.05.2017.
 */
public class StereoOnWithCDCCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
