package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
C:/File/111.part2.txt
C:/File/111.part3.txt
C:/File/111.part4.txt
C:/File/111.part5.txt
C:/File/111.part1.txt
C:/File/111.part11.txt

//.substring(0,list.first().lastIndexOf(".")
//.replace(".part1",""
*/


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws  IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        TreeSet <String> list = new TreeSet<String>(new Comparator<String>()
        {


            @Override
            public int compare(String o1, String o2)
            {
                String str1 = o1.substring(o1.lastIndexOf(".part")+5);
                String str2 = o2.substring(o2.lastIndexOf(".part")+5);

                return Integer.valueOf(str1).compareTo(Integer.valueOf(str2));
            }
        });


        String s;
        while (!( s = bf.readLine()).equals("end"))
        {
            list.add(s);
        }


        FileInputStream fileInputStream = null;

        RandomAccessFile  outputStream = new RandomAccessFile(list.first().substring(0,list.first().lastIndexOf(".")),"rw");
        for (String x : list)
        {
            fileInputStream = new FileInputStream(x);
            byte[] buffer = new byte[fileInputStream.available()];
            while (fileInputStream.available() > 0)
            {
                 fileInputStream.read(buffer);

                outputStream.write(buffer);


            }


        }
        bf.close();
        fileInputStream.close();
        outputStream.close();

    }


}
