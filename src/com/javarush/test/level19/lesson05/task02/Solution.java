package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(s1));
        ArrayList<String> list =new ArrayList<String>();
        String s;
        while ((s = bufferedReader.readLine())!=null){

            list.add(s);
        }
        String[] sss;
        int count =0;
        for (String x : list)
        {
            sss = (x.split("[ ,!?/.><|]"));
            for (int i =0;i<sss.length;i++)
                if(sss[i].toLowerCase().equals("world"))
                    count++;
        }
        System.out.print(count);
        bf.close();
        bufferedReader.close();
    }
}
