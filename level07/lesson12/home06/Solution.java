package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
       Human ded1 = new Human("Deda1", true, 55, null, null);
        Human ded2 = new Human("Deda2", true, 57, null, null);
        Human bab1 = new Human("Baba1", false, 54, null, null);
        Human bab2 = new Human("Baba2", false, 54, null, null);
        Human otec = new Human("Папа", true, 28, ded1, bab1);
        Human mama = new Human("Мама", false, 28, ded2, bab2);
        Human reb1 = new Human("Петя", true, 4, otec, mama);
        Human reb2 = new Human("Фрол", true, 3, otec, mama);
        Human reb3 = new Human("Фёкла", false, 1, otec, mama);


        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(otec);
        System.out.println(mama);
        System.out.println(reb1);
        System.out.println(reb2);
        System.out.println(reb3);
        //напишите тут ваш код
    }

    public static class Human
    {
        String имя;
        boolean пол;
        int возраст;
        Human отец;
        Human мать;

        public Human (String имя, boolean пол, int возраст, Human отец, Human мать){

            this.имя = имя;
            this.пол = пол;
            this.возраст = возраст;
            this.отец = отец;
            this.мать = мать;
        }




        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.имя;
            text += ", пол: " + (this.пол ? "мужской" : "женский");
            text += ", возраст: " + this.возраст;

            if (this.отец != null)
                text += ", отец: " + this.отец.имя;

            if (this.мать != null)
                text += ", мать: " + this.мать.имя;

            return text;
        }
    }

}
