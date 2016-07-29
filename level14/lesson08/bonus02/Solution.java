package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        String s1 = reader.readLine();
        int i1 = Integer.parseInt(s1);

        int min = i;
        if (min > i1) min = i1;
        int max = i;
        if (max < i1) max = i1;



        List<Integer> list = new ArrayList<Integer>();

        for (int a = 1; a <= min; a++ ){
            if (min%a == 0) list.add(a);
        }


        int nod = 0;


        if (max%list.get(list.size()-1) == 0) nod = list.get(list.size()-1);
        else nod = list.get(list.size()-2);

        System.out.println(nod);




    }
}
