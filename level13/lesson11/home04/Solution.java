package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        FileWriter out = new FileWriter(reader.readLine());

        ArrayList<String> list = new ArrayList<String>();
        while (true){
            String s = reader.readLine();
            list.add(s+"\n");
            if (s.equals("exit")){
                for ( String s1 : list){
                    out.write(s1);}
                    break;
                }
            }

        out.close();



        }




    }

