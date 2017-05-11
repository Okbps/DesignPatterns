package com.ch06Command;

/**
 * Created by Aspire on 11.05.2017.
 */
public class TvOffCommand implements Command{
    TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
