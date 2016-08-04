package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Евгений on 03.08.2016.
 */
public class Moon implements Planet
{
    private static Moon instance;

    Moon(){}

    public static Moon getInstance(){
        if(instance == null){
            instance = new Moon();
        }
        return instance;
    }
}
