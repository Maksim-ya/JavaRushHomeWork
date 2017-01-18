package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        String s1 = bf.readLine();
        String s2 = bf.readLine();

        FileInputStream inputStream1 = new FileInputStream(s1);
        FileInputStream inputStream2 = new FileInputStream(s2);


        byte[] buffer = new byte[inputStream1.available()];

            int  x =inputStream1.read(buffer);

        RandomAccessFile outputStream = new RandomAccessFile(s1,"rw");
        while (inputStream2.available()>0){
            int  s =inputStream2.read();
            outputStream.write(s);}
            outputStream.seek(outputStream.length());
            outputStream.write(buffer,0,x);



       /* while (inputStream.available()>0){
            int  s =inputStream.read();
            outputStream.write(s);
        }
        //outputStream.seek(0);
        while (inputStream.available()>0){


            int s11=inputStream.read();
            outputStream.write(s11);

        }*/

        inputStream1.close();
            inputStream2.close();
        outputStream.close();;
        bf.close();
    }
}
