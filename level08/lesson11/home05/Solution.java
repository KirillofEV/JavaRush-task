package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.toUpperCase;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        char c;
        boolean l = false;

        String str[] = new String[s.length()];
        for (int i=0;i<str.length;i++)
        {
            c = s.charAt(i);
            if (c != ' ')
            {
                str[i] = Character.toString(c);
                if (!l)
                {
                    str[i] = str[i].toUpperCase();
                    l = true;
                }
            }
            else
            {
                str[i] = Character.toString(c);
                l = false;
            }

        }
        s = "";
        for (String a : str) s += a;
        System.out.print(s);
    }


}
