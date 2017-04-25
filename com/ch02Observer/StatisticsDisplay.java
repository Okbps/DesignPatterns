package com.ch02Observer;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Aspire on 22.04.2017.
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private ArrayList<Float> temperatures = new ArrayList<Float>();
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    private float getAvg(){
        if(temperatures.size()>0) {
            float avg = 0;
            for (float temp : temperatures) {
                avg += temp;
            }
            ;
            return avg / temperatures.size();
        };

        return 0;
    }

    @Override
    public void display() {
        DoubleSummaryStatistics stats = temperatures.stream()
                .mapToDouble((x) -> x)
                .summaryStatistics();

        if(temperatures.size()>0) {
            System.out.println(String.format("Avg/Max/Min temperature %.2f/%.2f/%.2f",
                    stats.getAverage(),
                    stats.getMax(),
                    stats.getMin())
            );
        }else{
            System.out.println("Not enough data");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            temperatures.add(weatherData.getTemperature());
            display();
        }
    }
}
