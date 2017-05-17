package com.ch08Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aspire on 17.05.2017.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public boolean customerWantsCondiments() {
        if(getUserInput().toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee? (y/n)");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = reader.readLine();
        } catch (IOException e) {
            System.out.println("I/O error");
        }

        if(answer==null){
            answer = "no";
        }

        return answer;
    }
}
