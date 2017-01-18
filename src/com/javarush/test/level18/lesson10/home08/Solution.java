package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list= new ArrayList<String>();
        String s;
        while (!( s = bf.readLine()).equals("exit"))
        {

                list.add(s);

        }
        for ( String x :list)
        {
            ReadThread  readThread = new ReadThread(x);

            readThread.start();
            try
            {
                readThread.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
            bf.close();


            System.out.println(resultMap);




    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {

            this.fileName = fileName;
        }
       public void run()
       {
           TreeMap<Integer,Integer> treeMap = new TreeMap<Integer, Integer>();
           ArrayList<Integer> list = new ArrayList<Integer>();
           int max =0;
           FileInputStream inputStream = null;
           try
           {
                inputStream = new FileInputStream(fileName);
           }
           catch (FileNotFoundException e)
           {
               e.printStackTrace();
           }
           try
           {
               while (inputStream.available()>0){
                   int i = inputStream.read();
                   list.add(i);
               }
           }
           catch (IOException e)
           {
               e.printStackTrace();
           }
           for ( int i = 0; i< list.size(); i++){
               for ( int j = 0; j< list.size(); j++){
                   if (list.get(i)==list.get(j))
                       max++;}
               treeMap.put(max,list.get(i));
               max=0;
           }
           try
           {
               inputStream.close();
           }
           catch (IOException e)
           {
               e.printStackTrace();
           }
           resultMap.put(fileName,treeMap.get(treeMap.lastKey()));

       }
    }
}
