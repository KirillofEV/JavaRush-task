package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
 public String Имя;
    public int возраст;
    public String пол;

    public Friend(String Имя)
    {
        this.Имя = Имя;
    }
    public Friend(String Имя, int возраст)
    {
        this.Имя = Имя;
        this.возраст = возраст;
    }
    public Friend(String Имя, int возраст, String пол)
    {
        this.Имя = Имя;
        this.возраст = возраст;
        this.пол = пол;
    }
    //напишите тут ваш код

}