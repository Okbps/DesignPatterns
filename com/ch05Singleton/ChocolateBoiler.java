package com.ch05Singleton;

/**
 * Created by Aspire on 03.05.2017.
 */
public class ChocolateBoiler {
    private boolean empty, boiled;

    private volatile static ChocolateBoiler ourInstance;

    public static ChocolateBoiler getInstance() {
        if(ourInstance == null){
            synchronized (ChocolateBoiler.class){
                if(ourInstance == null) {
                    ourInstance = new ChocolateBoiler();
                }
            }
        }
        return ourInstance;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill(){
        if(isEmpty()){
           empty = false;
           boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            boiled = false;
        }
    }

    public void boil(){
        if(!isEmpty()){
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
