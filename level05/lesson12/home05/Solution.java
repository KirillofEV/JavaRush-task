package com.javarush.test.level05.lesson12.home05;

import java.io.*;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String b = "сумма";
        int m = 0;
        for ( ; ; ){
            String s = reader.readLine();
            if(s.equals(b))
            {

                System.out.println(m);
                        break;}
            else
            {int a = Integer.parseInt(s);
            m = m + a;}

        }


        //напишите тут ваш код
    }
}
