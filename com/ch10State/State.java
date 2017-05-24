package com.ch10State;

/**
 * Created by Aspire on 24.05.2017.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void dispense();
    void turnCrank();
}
