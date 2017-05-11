package com.ch06Command;

/**
 * Created by Aspire on 11.05.2017.
 */
public class TV {
    String location = "";

    public void on() {
        System.out.println(location + "TV is on");
    }

    public void off() {
        System.out.println(location + "TV is off");
    }

    public void setInputChannel(String channel){
        System.out.println("Input channel is set to "+channel);
    }

    public void setVolume(int volume){
        System.out.println("Volume is set to "+volume);
    }

    public TV(String location) {
        this.location = location;
    }
}
