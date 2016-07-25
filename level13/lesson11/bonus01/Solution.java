package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new FileReader(filename));

        List<Integer> list = new ArrayList<Integer>();


        String s;
        while ((s = reader1.readLine())!= null){
            int a = Integer.parseInt(s);
            list.add(a);
        }

       List<Integer> list1 = new ArrayList<Integer>();
        for (int b = 0; b < list.size(); b++){
            if ( list.get(b)%2 == 0){
                list1.add(list.get(b));
            }
        }

        for (int i = list1.size()-1; i > 0; i--)
        {
            for (int j = 0; j < i; j++){
                if (list1.get(j) > list1.get(j+1) ){
                    int t = list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, t);
                }
            }
        }




        for (int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }












        // напишите тут ваш код
    }
}
