package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        bf.close();
        String s;
        ArrayList<String> list =new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(s1));
        PrintWriter bufferedWriter = new PrintWriter(new FileWriter(s2));
        while ((s=bufferedReader.readLine())!=null)
        {

            list.add(s);

        }
        bufferedReader.close();
        for (String x:list )
        {

            String sss = x.replace(".", "!");
            bufferedWriter.println(sss);
        }


        bufferedWriter.close();

    }
}
