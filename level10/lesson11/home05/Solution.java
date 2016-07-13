package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }


        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        String sum = list.get(0);
        for (int i = 1; i < list.size(); i++)
        {
            sum += list.get(i);
        }


        int[] znach = new int[alphabet.size()];


        char[] stroka = sum.toCharArray();

        for (int i = 0; i < stroka.length; i++)
        {
            for (int j = 0; j < znach.length; j++)
            {
                if (alphabet.get(j) == stroka[i])
                    znach[j]++;
            }
        }

        for (int a = 0; a < alphabet.size(); a++)
        {
            System.out.println((abcArray[a])+ " " + (znach[a]));
        }




        /*HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int a = 0; a < alphabet.size(); a++)
        {
            map.put(abcArray[a], znach[a]);
        }

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<Character, Integer> pair = iterator.next();
            Character key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key);*/


            //напишите тут ваш код

    }
}
