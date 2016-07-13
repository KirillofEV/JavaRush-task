package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        String colorhair;
        String country;
        String city;

       public Human (String name) {this.name = name;}
        public Human(int age, String name){
            this.age = age;
            this.name = name;}
        public Human(boolean sex, String name){
            this.sex = sex;
            this.name = name;
        }
        public Human(String colorhair, String name){
            this.colorhair = colorhair;
            this.name = name;
        }
        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;

        }
        public Human(String name, int age, boolean sex, String colorhair){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.colorhair = colorhair;
        }
        public Human(String name, int age, boolean sex, String colorhair, String country){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.colorhair = colorhair;
            this.country = country;
        }
        public Human(String name, int age, boolean sex, String colorhair, String country, String city){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.colorhair = colorhair;
            this.country = country;
            this.city = city;

        }
        public Human(String name, String colorhair, String country){
            this.name = name;
            this.colorhair = colorhair;
            this.country = country;


        }
        public Human(String name, String colorhair, String country, String city){
            this.name = name;
            this.colorhair = colorhair;
            this.country = country;
            this.city = city;

        }




    }


        //напишите тут ваши переменные и конструкторы

}
