package com.ch11Proxy;

import com.ch10State.GumballMachine;

/**
 * Created by Aspire on 27.05.2017.
 */
public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("Gumball machine: " + machine.getLocation());
        System.out.println("Current invenroty: " + machine.getCount() + " gumballs");
        System.out.println("Current state: " + machine.getState());
    }
}
