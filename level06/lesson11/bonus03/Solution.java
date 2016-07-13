package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);
        String s4 = reader.readLine();
        int d = Integer.parseInt(s4);
        String s5 = reader.readLine();
        int e = Integer.parseInt(s5);





        int[] blok = {a, b, c, d, e};

        Arrays.sort(blok);

        System.out.println(blok[0]);
        System.out.println(blok[1]);
        System.out.println(blok[2]);
        System.out.println(blok[3]);
        System.out.println(blok[4]);




        //напишите тут ваш код
    }
}


//String s1 = reader.readLine();
//int n = Integer.parseInt(s1);