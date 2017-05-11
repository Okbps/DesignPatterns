package com.ch06Command;

/**
 * Created by Aspire on 04.05.2017.
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("No command is assigned");
    }

    @Override
    public void undo() {
        System.out.println("No command is assigned");
    }
}
