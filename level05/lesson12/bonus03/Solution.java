package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int a;
        int c = -2147483648;

      if (maximum >0)
        {
            for (a = 0; a < maximum; a++)
            {
                int b = Integer.parseInt(reader.readLine());

                if (b > c)
                    c = b;
            }
            maximum = c;
            //напишите тут ваш код
            System.out.println(maximum);
        }
    }
}
