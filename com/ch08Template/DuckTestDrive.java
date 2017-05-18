package com.ch08Template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aspire on 18.05.2017.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Морковка", 5),
                new Duck("Ярига", 2),
                new Duck("Матрена", 1),
                new Duck("Фотинья", 3),
                new Duck("Петр", 4)
        };

        Arrays.sort(ducks);

        Arrays.stream(ducks).forEach(System.out::println);
    }
}
