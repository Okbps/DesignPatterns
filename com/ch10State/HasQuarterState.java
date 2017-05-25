package com.ch10State;

import java.util.Random;

/**
 * Created by Aspire on 24.05.2017.
 */
public class HasQuarterState implements State{
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarter());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && gumballMachine.getCount()>1){
            gumballMachine.setState(gumballMachine.getWinner());
        }else {
            gumballMachine.setState(gumballMachine.getSold());
        }
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
