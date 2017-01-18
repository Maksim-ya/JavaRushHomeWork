package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources

C:/Users/Максим/Desktop/222.txt
C:/Users/Максим/Desktop/444.txt
*/

import java.io.*;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        int count =0;
        ArrayList<Integer> t = new ArrayList<Integer>();

        ArrayList<Integer> t1 = new ArrayList<Integer>();
        for (int c = 65;c<91;c++) {
            t1.add(c);
        }
        for (int c = 97;c<123;c++)
        {  t1.add(c);}
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available()>0){
            int s =inputStream.read();
           t.add(s);
        }


            for(int i =0; i<t.size();i++){
                for(int j =0; j<t1.size();j++){


                        if (t.get(i)==( t1.get(j))){
                            count++;}}}
        System.out.println(count);


inputStream.close();
    }
}
