package com.ch10State;

/**
 * Created by Aspire on 24.05.2017.
 */
public class NoQuarterState implements State{
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    public String toString() {
        return "waiting for quarter";
    }
}
