package com.javarush.test.level14.lesson08.bonus01;

import javax.naming.NamingException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try//1
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try//2
        {
            String[] mas = {"Java", "JavaRush"};
            mas[2] = "C++";
        }
        catch (Exception e){
            exceptions.add(e);
        }

        try//3
        {
            List list = null;
            list.add(1);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try//4
        {
            int[] n = new int[-5];
        }
        catch(Exception e)
        {
            exceptions.add(e);
        }

        try//5
        {
            Object szStr[] = new String[5];
            szStr[0] = new Character('*');
        }
        catch(Exception e)
        {
            exceptions.add(e);;
        }
        try//6
        {
            Integer.parseInt("none");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try//7
        {
            Object i = Integer.valueOf(2);
            String s = (String)i;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try//8
        {
            throw new NamingException();
        }catch (Exception e)
        {
            exceptions.add(e);
        }


        try //9
        {
            throw new UnsupportedOperationException("I do not know of exceptions");
        }catch(Exception e) {
            exceptions.add(e);
        }

        try {
            InputStream is = new FileInputStream("file.txt");
        } catch(Exception e) {
            exceptions.add(e);
        }
















        //Add your code here

    }
}
