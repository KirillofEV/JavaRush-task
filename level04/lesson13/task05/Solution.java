package com.javarush.test.level04.lesson13.task05;

import java.io.*;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for ( int a = 0; a < 10; a++)
        {
            System.out.println(s+" любит меня.");

        }


    }
}
