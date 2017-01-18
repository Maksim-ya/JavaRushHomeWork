package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        BufferedReader f = new BufferedReader(new FileReader(fileName));
        String s;
        String[]sss;
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        Map<String,Double> map = new HashMap<String,Double>();
        while ((s=f.readLine())!=null){
            list.add(s);
        }
        for (String x:list)
        {
            sss=x.split(" ");
            for (int j =0; j<sss.length; j++)
            {
                list1.add(sss[j]);
            }
        }
        map.put(list1.get(0),Double.parseDouble(list1.get(1)));

        for (int i =2; i<list1.size(); i=i+2)
        {

            if (map.containsKey(list1.get(i)))
            {        map.put(list1.get(i),map.get(list1.get(i))+Double.parseDouble(list1.get(i+1)));
            }
            else{
                map.put(list1.get(i),Double.parseDouble(list1.get(i+1)));

            }
        }
        Double d = 0.0;
            for (Map.Entry pair : map.entrySet() )
            {
                if(Double.parseDouble(String.valueOf(pair.getValue())) > d){
                 d = Double.parseDouble(String.valueOf(pair.getValue()));
                }

            }

        for (Map.Entry pair : map.entrySet() )
        {
            if( Double.parseDouble(String.valueOf(pair.getValue()))==d){
            System.out.println(pair.getKey());}
        }
     f.close();

    }
}
