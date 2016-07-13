package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {


        Man man1 = new Man( "Petr", 1, "Strit1");
        Man man2 = new Man( "Fedr", 2, "DounStrit");


        Woman woman1 = new Woman( "Masha", 2, "PopaStrit");
        Woman woman2 = new Woman("Valia", 3, "Strit2");

        //создай по два объекта каждого класса тут

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
        //выведи их на экран тут
    }

    public static class Man
    {
        String name;
        int age;
        String address;


        public Man (String name)
        {
            this.name = name;
            this.age = 0;
            this.address = null;
        }
        public Man (String name, int age)
        {
            this.name = name;
            this.age = age;
            this.address = null;
        }
        public Man (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
        public String name;
        public int age;
        public String address;


        public Woman (String name)
    {
        this.name = name;
        this.age = 0;
        this.address = null;
    }
        public Woman (String name, int age)
        {
            this.name = name;
            this.age = age;
            this.address = null;
        }
        public Woman (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }


    }
            //добавьте тут ваши классы
}
