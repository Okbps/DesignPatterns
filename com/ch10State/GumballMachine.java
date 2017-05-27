package com.ch10State;

/**
 * Created by Aspire on 24.05.2017.
 */
public class GumballMachine {
    final State NO_QUARTER;
    final State HAS_QUARTER;
    final State SOLD_OUT;
    final State SOLD;
    final State WINNER;
    final String location;

    State state;
    int count = 0;

    public GumballMachine(String location, int count) {
        NO_QUARTER = new NoQuarterState(this);
        HAS_QUARTER = new HasQuarterState(this);
        SOLD_OUT = new SoldOutState(this);
        SOLD = new SoldState(this);
        WINNER = new WinnerState(this);
        state = SOLD_OUT;
        this.location = location;

        this.count = count;
        if(count>0){
            state = NO_QUARTER;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuarter() {
        return NO_QUARTER;
    }

    public State getHasQuarter() {
        return HAS_QUARTER;
    }

    public State getSoldOut() {
        return SOLD_OUT;
    }

    public State getSold() {
        return SOLD;
    }

    public State getWinner() {
        return WINNER;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }

    public void dispense(){
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball coming rolling out the slot...");
        if(count>0){
            count--;
        }
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
