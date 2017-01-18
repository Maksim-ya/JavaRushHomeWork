package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list =new ArrayList<String>();
        String s;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(s1));
        BufferedWriter bw =  new BufferedWriter(new FileWriter(s2));
        while ((s = bufferedReader.readLine())!=null){

            list.add(s);
        }
        for (String x : list){ x = (x.replaceAll("\\p{Punct}", ""));
        bw.write(x);}
        bf.close();
        bw.close();
        bufferedReader.close();
    }
}
