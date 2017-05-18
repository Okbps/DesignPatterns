package com.ch08Template;

/**
 * Created by Aspire on 18.05.2017.
 */
public class Duck implements Comparable{
    private String name;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Duck(String name, int weitght) {
        this.name = name;
        this.weight = weitght;
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck)o;
        if(this.weight > duck.getWeight()){
            return 1;
        }else if(this.weight < duck.getWeight()){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }
}
