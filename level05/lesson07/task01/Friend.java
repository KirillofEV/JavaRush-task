package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String filename = null;

    public void initialize(String Имя)
{
    this.filename = Имя;
}
    public void initialize(String Имя, int возраст)
    {
        this.filename = Имя + возраст;
    }
    public void initialize(String Имя, int возраст,String пол)
    {
        this.filename = Имя + возраст + пол;
    }



    //напишите тут ваш код
}
