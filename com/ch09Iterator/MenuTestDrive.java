package com.ch09Iterator;

/**
 * Created by Aspire on 19.05.2017.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(), new PancakeHouseMenu());
        waitress.printMenu();
    }
}
