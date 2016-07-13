package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно заменить функциональность программы
Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

       // ArrayList<String> list1 = new ArrayList<String>();

       // list1.addAll(list);

        for (int i = 0; i < list.size(); i++)
        {
            String s1 = list.get(i);

            int a = s1.length();


            if (a % 2 == 0)
            {
                list.set(i, s1 + " " + s1);
            } else list.set(i, s1 + " " + s1 + " " + s1);
        }


        for (int c = 0; c < list.size(); c++)
        {
            System.out.println(list.get(c));
        }
    }
}
