package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
import  java.io.*;
import java.util.ArrayList;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        OutputStream outStream = new FileOutputStream (s);
        //String s1 = reader.readLine();
        //InputStream inStream = new BufferedInputStream(s);

       while (true)
       {
           String s1 = reader.readLine();

           if (s1.equals("exit"))
           {
               //int data = reader.read();

                   outStream.write(s1.getBytes());


               break;
           }
           else
               outStream.write((s1+"\r\n").getBytes());

       }
        outStream.close();

    }
}
