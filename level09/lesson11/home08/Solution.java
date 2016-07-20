package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] piat = {2, 4, 3, 5, 6};
        int[] dva = {1,7};
        int[] chetyre = {2, 4, 5, 6};
        int[] sem = {1, 2, 3, 4, 5, 6, 7};
        int[] nol = new int[0];
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(piat);
        list.add(dva);
        list.add(chetyre);
        list.add(sem);
        list.add(nol);
        return list;





        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
