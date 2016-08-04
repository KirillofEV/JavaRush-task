package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String s;
        while (!(s=reader.readLine()).equals("exit") )
        {
            if ( s.contains(".") ) print(Double.parseDouble(s));
            else if (s.matches("\\d+") && (Integer.parseInt(s) > 0) && (Integer.parseInt(s) < 128) ) print(Short.parseShort(s));
            else if (s.matches("\\d+") && (Integer.parseInt(s) >= 128) ) print(Integer.parseInt(s));
            else print(s);
            {



            /*try{
            if (s.equals("exit")) break;
            else if (s.contains(".")) {
                double b = Double.parseDouble(s);
                print(b);
            }
            else if ((Short.parseShort(s))>0 & (Short.parseShort(s))<128){
                short i = (Short.parseShort(s));
                print(i);
            }
            else if ((Integer.parseInt(s)) >= 128){

                print((Integer)(Integer.parseInt(s)));
            }}
            catch (NumberFormatException e){
             print(s);}*/
            }

            }

        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
