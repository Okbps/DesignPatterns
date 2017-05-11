package com.ch06Command;

/**
 * Created by Aspire on 11.05.2017.
 */
public class HotTubOffCommand implements Command{
    private HotTub hotTub;

    public HotTubOffCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.off();
    }

    @Override
    public void undo() {
        hotTub.on();
        hotTub.jetsOn();
        hotTub.circulate();
        hotTub.setTemperature(28);
    }
}
