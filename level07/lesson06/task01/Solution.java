package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> list = new ArrayList<String>();
        String s = "Шляпа";
        String s1 = "Шляпа1";
        String s2 = "Шляп2а";
        String s3 = "Шляпа3";
        String s4 = "Шляпа4";
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);


        System.out.println(list.size());

        for (int a = 0; a <5 ; a++)
            System.out.println(list.get(a));


        //напишите тут ваш код

    }
}
