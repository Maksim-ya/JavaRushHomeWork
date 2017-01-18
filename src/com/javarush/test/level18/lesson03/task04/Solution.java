package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        Map<Integer,Integer> kkk = new HashMap<Integer, Integer>();

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            list.add(data);
        }


        for (int i = 0;i<list.size();i++)
        {
            kkk.put(list.get(i),1);
        }
        for (int i = 0;i<list.size();i++)
        {
            for (int j =i+1;j<list.size();j++)
            {
                if(list.get(i)==list.get(j))
                {
                    kkk.put(list.get(i),kkk.get(list.get(i))+1);
                    list.remove(j);
                }

            }
        }
        int min = 10000;

        for(int i = 0;i<list.size();i++)
        {


            if(kkk.get(list.get(i))<min)
            {
                min = kkk.get(list.get(i));
            }
        }
        for (Map.Entry<Integer,Integer> pair : kkk.entrySet()) {
            if (min==pair.getValue()) {

                result.add(pair.getKey());
            }
        }
        for (Integer text1 : result)
        {
            System.out.print(text1 + " ");
        }


        inputStream.close();
        bf.close();


    }
}
