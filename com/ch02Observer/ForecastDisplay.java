package com.ch02Observer;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Aspire on 22.04.2017.
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private Observable observable;
    private List<String>predictions = Arrays.asList(
            "Improving weather on the way!",
            "Watch out for cooler, rainy weather",
            "More of the same"
    );

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
            System.out.println("Forecast: "+predictions.get((int)(predictions.size()*Math.random())));
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            display();
        }
    }
}
