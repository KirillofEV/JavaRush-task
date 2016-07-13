package com.javarush.test.level09.lesson08.task04;

import org.omg.CORBA.Object;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());




    }

    public static void processExceptions(Solution obj) {


            try
            {
                obj.method1();
                obj.method2();
                obj.method3();
            }

            catch (RemoteException e)
            {
                System.out.println("RemoteException");
            }
            catch (NoSuchFieldException e)
            {
                System.out.println("NoSuchFieldException");
            }
            catch (IOException e)
            {
                System.out.println("IOException");
            }


    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
