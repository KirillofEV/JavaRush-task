package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Евгений on 03.08.2016.
 */
public class Sun implements Planet
{
    private static Sun instance;

    Sun(){}

    public static Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }
}
