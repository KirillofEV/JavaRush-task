package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Евгений on 04.08.2016.
 */
public class SubSolution extends Solution
{

    public SubSolution()
    {
    }

    public SubSolution(Double aDouble)
    {
        super(aDouble);
    }

    public SubSolution(Integer integer, String string, Double aDouble)
    {
        super(integer, string, aDouble);
    }

    protected SubSolution(String name)
    {
        super(name);
    }

    protected SubSolution(String string, Double aDouble, Integer integer)
    {
        super(string, aDouble, integer);
    }

    protected SubSolution(Double aDouble, Integer integer)
    {
        super(aDouble, integer);
    }

    SubSolution(Double aDouble, Integer integer, String name)
    {
        super(aDouble, integer, name);
    }

    SubSolution(Integer integer, Double aDouble, String name)
    {
        super(integer, aDouble, name);
    }

    SubSolution(String string, Integer integer, Double aDouble)
    {
        super(string, integer, aDouble);
    }
    private SubSolution(Integer integer)
    {

    }
    private SubSolution(Integer integer, String name)
    {

    }
    private SubSolution(String name,Integer integer)
    {

    }




}





