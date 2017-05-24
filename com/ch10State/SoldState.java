package com.ch10State;

/**
 * Created by Aspire on 24.05.2017.
 */
public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void dispense() {

    }

    @Override
    public void turnCrank() {

    }
}
