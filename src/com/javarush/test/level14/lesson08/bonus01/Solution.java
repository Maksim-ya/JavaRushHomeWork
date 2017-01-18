package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String[] catNames = {"Васька", "Барсик", "Мурзик"};
            String x = catNames[3];

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            BufferedReader br =
                    new BufferedReader(new FileReader("MyFile.txt"));

        }
        catch(Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        }
        catch(Exception e)
        {
            exceptions.add(e);

        }

        try
        {
            Object ch = new Character('*');
            System.out.println((Byte)ch);
        }
        catch(Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            int[] nNegArray = new int[-5];
        }
        catch(Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            int[] nNegArray = new int[5];
            nNegArray = null;
            int i = nNegArray.length;
        }
        catch(Exception e)
        {
            exceptions.add(e);

        }


        try
        {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        }
        catch(Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            String s = "rthrthtrh";
            int i = Integer.parseInt(s);
        }
        catch(Exception e)
        {
            exceptions.add(e);

        }
        try
        {
            Thread t;
            t = Thread.currentThread();
            t.start();
        }
        catch(Exception e)
        {
            exceptions.add(e);

        }
    }
}
