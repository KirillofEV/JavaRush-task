package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
            int m = 0;
            while (true)
            {

                String s = reader.readLine();
                int a = Integer.parseInt(s);
                if (a != -1)
                {m = m +a;}
                else
                {
                    System.out.println(m - 1);
                    break;
                }


            }

         //напишите тут ваш код
    }
}
