package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        ArrayList<Human> dety = new ArrayList<Human>();
        dety.add(new Human("Петя2", true, 10));
        dety.add(new Human("Петя1", true, 11));
        dety.add(new Human("Петя", true, 10));

        ArrayList<Human> mp = new ArrayList<Human>();
        mp.add(new Human("Мама", false, 29, dety));
        mp.add(new Human("Папа", true, 29, dety));

        ArrayList<Human> gr = new ArrayList<Human>();

        gr.add(new Human("Дедушка", true, 54 ));
        gr.add(new Human("Дедушка1", true, 52));
        gr.add(new Human("Бабушка", false, 53));
        gr.add(new Human("Бабушка1", false, 51));

        ArrayList<Human> finall = new ArrayList<Human>();

        finall.addAll(dety);
        finall.addAll(mp);
        finall.addAll(gr);

        finall.toString();

        for (Human ss : finall)
        {System.out.print(ss);
                }



        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human( String name, boolean sex, int age, ArrayList<Human> children){
            this.children = children;
            this.name = name;
            this.sex = sex;
            this.age = age;}









        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
