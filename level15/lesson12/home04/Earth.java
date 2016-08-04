package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Евгений on 03.08.2016.
 */
public class Earth implements Planet
{
    private static Earth instance;

    Earth(){}

    public static Earth getInstance(){
        if(instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
