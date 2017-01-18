package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

C:/File/777.txt
Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list =new ArrayList<String>();

        String[] sss;
        TreeMap<String,Double> map = new TreeMap<String, Double>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        bf.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(s1));
        String s;
        while ((s = bufferedReader.readLine())!=null){

            list.add(s);
        }
        bufferedReader.close();
        for (String x : list)
        {
            sss = (x.split(" "));
            for (int i =0;i<sss.length;i=i+2)


                   map.put(sss[i],Double.parseDouble(sss[i+1]));

        }
        for (Map.Entry<String,Double> entry: map.entrySet())
        {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " " + value);
        }


    }
}
