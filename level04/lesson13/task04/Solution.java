package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     String s = "8";
        for (int a = 0; a < 9; a++)
        {
            System.out.print(s);
        //напишите тут ваш код
        }
        for (int b=0; b < 11;b++ )
        {
            System.out.println(s);
        }

    }
}
