package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(12.1, "Число1");
        labels.put(12.2, "Число2");
        labels.put(12.3, "Число3");
        labels.put(12.4, "Число4");

        labels.put(12.5, "Число5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
