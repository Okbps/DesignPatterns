package com.ch10State;

import java.io.Serializable;

/**
 * Created by Aspire on 24.05.2017.
 */
public interface State extends Serializable{
    void insertQuarter();
    void ejectQuarter();
    void dispense();
    void turnCrank();
}
