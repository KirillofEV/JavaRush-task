package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {

       ArrayList<String> list = new ArrayList<String>();
        String s = "лалалала";
        String s1 = "трулалалал";
        list.add(s);
        list.add(s1);
        ArrayList<String> list1 = new ArrayList<String>();
        String s2 = "опаопавоппаи";
        String s3 = "оплоавлоаптавпот";
        list1.add(s2);
        list1.add(s3);

        ArrayList<String>[] lis = new ArrayList[2];

        lis[0] = list;
        lis[1] = list1;


        //напишите тут ваш код

        return lis;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}