package com.ch06Command;

/**
 * Created by Aspire on 11.05.2017.
 */
public class HotTub {
    private int temperature = 0;

    public void on() {
        System.out.println("Hot tub is on");
    }

    public void off() {
        System.out.println("Hot tub is off");
    }

    public void jetsOn() {
        System.out.println("Jets are on");
    }

    public void jetsOff() {
        System.out.println("Jets are off");
    }

    public void circulate(){
        System.out.println("Hot tub is circulating");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is set to "+temperature);
    }
}
