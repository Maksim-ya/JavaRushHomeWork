package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
    ArrayList<String> list =new ArrayList<String>();
        String[] sss;
       ArrayList<Integer> list1 = new ArrayList<Integer>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(s1));
        FileWriter bw =  new FileWriter(s2);
        String s;
        while ((s = bufferedReader.readLine())!=null){

            list.add(s);
        }
        for (String x : list){ sss = (x.split(" "));
        for (int i =0;i<sss.length;i++)
           try{ if( Integer.parseInt(sss[i])%1==0)list1.add(Integer.parseInt(sss[i]));}
           catch (Exception e){}



            }
        for (int y : list1){String z = String.valueOf(y); bw.write(z);  bw.write(32);}
        bf.close();
        bw.close();
        bufferedReader.close();



    }
}
