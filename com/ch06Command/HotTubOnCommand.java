package com.ch06Command;

/**
 * Created by Aspire on 11.05.2017.
 */
public class HotTubOnCommand implements Command{
    private HotTub hotTub;

    public HotTubOnCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.on();
        hotTub.jetsOn();
        hotTub.circulate();
        hotTub.setTemperature(28);
    }

    @Override
    public void undo() {
        hotTub.off();
    }
}
