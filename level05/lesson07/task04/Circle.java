package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
   private int centerX;
    private int centerY;
    private int radius;
    private int widgth;
    private String color;
    public void initialize(int centerX, int centerY, int radius)
    {
        this.centerX =  centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int widgth)
    {
        this.centerX =  centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.widgth = widgth;
    }
        public void initialize(int centerX, int centerY, int radius, int widgth, String color)
    {
        this.centerX =  centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.radius = widgth;
        this.color = color;
    }

    //напишите тут ваш код

}
