package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
  String Имя, цвет;
    int рост;

    public Dog(String Имя)
    {
        this.Имя = Имя;
        this.рост = 0;
        this.цвет = null;
    }
    public Dog(String Имя, int рост)
    {
        this.Имя = Имя;
        this.рост = рост;
        this.цвет = null;
    }
    public Dog(String Имя, int рост, String цвет)
    {
        this.Имя = Имя;
        this.рост = рост;
        this.цвет = цвет;
    }//напишите тут ваш код

}
