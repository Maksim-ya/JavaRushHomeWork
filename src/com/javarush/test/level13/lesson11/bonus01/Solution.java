package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/


        import java.io.*;

        import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        InputStream inStream = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<Integer>();


        inStream.close();
        for     (int l : list)
            System.out.println(l);
    }// напишите тут ваш код

}
/*
int x = Integer.parseInt(s);
if (x > 0 && x < 128)
        {
        print((short) x);

        }
        if (x > 128)
        {
        print(x);

        }
        if (x);
        {
        print((double) x);

        }
        */