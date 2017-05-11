package com.ch06Command;

/**
 * Created by Aspire on 11.05.2017.
 */
public class TvOnCommand implements Command{
    TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
