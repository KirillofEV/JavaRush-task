package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int m = Integer.parseInt(s);
        String s1 = reader.readLine();
        int n = Integer.parseInt(s1);

      for (int a = 0; a < m ; a++ )
      {
          for (int b = 0; b < n; b++)
          {
              System.out.print("8");

          }
          System.out.println();
      }



         //напишите тут ваш код

    }
}
