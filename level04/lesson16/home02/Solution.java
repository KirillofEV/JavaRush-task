package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);

        if ( a > b && a < c || a < b && a > c)
            System.out.println(a);
        if ( b > a && b < c || b < a && b > c)
            System.out.println(b);
        if ( c > a && c < b || c < a && c > b)
            System.out.println(c);


        //напишите тут ваш код
    }
}
