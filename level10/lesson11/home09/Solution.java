package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        Integer[] raz = new Integer[20];

        for (int i =0; i < 20; i++){
            raz[i] = 0;
        }

        for (int i = 0; i < 20; i++){
            for (int j = 0; j <20; j++){
                if((list.get(i)).compareTo(list.get(j)) == 0){
                    raz[i]++;
                }
            }
        }

        String[] raz1 = new String[20];
        for (int i =0; i < 20; i++){
            raz1[i] = list.get(i);
        }


        for (int i = 0; i < 20; i++){
            result.put(raz1[i], raz[i]);
        }











        //напишите тут ваш код


        return result;
    }

}
