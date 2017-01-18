package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.*;
import java.util.*;



public class Solution {
    public static void main(String[] args) throws  Exception{
        FileInputStream inputStream = new FileInputStream("C:/Users/Максим/Desktop/222.txt");
        TreeMap <Integer,Integer> result = new TreeMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        while (inputStream.available()>0 ){
            int i =  inputStream.read();
            list.add(i);
        }

        for ( int i = 0; i< list.size(); i++){
            for ( int j = 0; j< list.size(); j++){
            if (list.get(i)==list.get(j))
                count++;}
            result.put(list.get(i),count);
            count=0;
        }
        for (Map.Entry e : result.entrySet()){
            System.out.println(String.valueOf(Character.toChars((Integer)e.getKey())) + " " + e.getValue());}
        inputStream.close();


    }


}