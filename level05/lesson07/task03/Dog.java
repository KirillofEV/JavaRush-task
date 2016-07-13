package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
  private String filename = null;
    public void initialize(String Имя)
    {
        this.filename = Имя;
    }
    public void initialize(String Имя, int рост)
    {
        this.filename = Имя + рост;
    }
    public void initialize(String Имя, int рост, String цвет)
    {
        this.filename = Имя + рост + цвет;
    }

    //напишите тут ваш код

}
