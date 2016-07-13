package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     ArrayList<String> list = new ArrayList<String>();
     String s = "мама";
        String s1 = "мыла";
        String s2 = "раму";
        String s3 = "именно";
        list.add(s);
        list.add(s1);
        list.add(s2);

        for (int i = 1; i < 6; i = i + 2 ){
            list.add(i, s3);
        }
        for (int i = 0; i < 6; i++){
            System.out.println(list.get(i));
        }
        //напишите тут ваш код

    }
}
