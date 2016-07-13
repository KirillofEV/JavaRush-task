package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();

        String s2 = reader.readLine();
        int y = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int m = Integer.parseInt(s3);
        String s4 = reader.readLine();
        int d = Integer.parseInt(s4);

        System.out.println("Меня зовут "+s1);
        System.out.println("Я родился "+d+"."+m+"."+y);



        //напишите тут ваш код
    }
}
