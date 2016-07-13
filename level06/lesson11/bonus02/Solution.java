package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat grandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat grandma = new Cat(grandmaName);

        String papaName = reader.readLine();
        Cat papa = new Cat(papaName, grandpa, null);

        String mamaName = reader.readLine();
        Cat mama = new Cat(mamaName, null, grandma);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, papa, mama);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, papa, mama);

        System.out.println(grandpa);
        System.out.println(grandma);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(son);
        System.out.println(daughter);

    }

    public static class Cat
    {
        private String name;
        private Cat parentpapa;
        private Cat parentmama;

        Cat(String name)
        {this.name = name;
        }

        Cat(String name, Cat parentpapa, Cat parentmama)
        {
            this.name = name;
            this.parentpapa = parentpapa;
            this.parentmama = parentmama;
        }

        @Override
        public String toString()
        {
            if (parentpapa == null && parentmama == null)
                return "Cat name is " + name + ", no mother" + ", no father";
            else if (parentpapa != null && parentmama == null )
                return "Cat name is " + name + ", no mother" + ", father is " + parentpapa.name;
            else if (parentpapa == null && parentmama != null )
                return "Cat name is " + name + ", mother is " + parentmama.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + parentmama.name + ", father is " + parentpapa.name;


        }
    }

}
