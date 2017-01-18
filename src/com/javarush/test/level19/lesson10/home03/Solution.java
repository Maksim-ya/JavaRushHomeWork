package com.javarush.test.level19.lesson10.home03;

import java.io.*;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        // String fileName = args[0];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(s1));
        BufferedReader f = new BufferedReader(inputStreamReader);

        // BufferedReader f = new BufferedReader(new FileReader(fileName));

        String s ;
        String []sss;
        ArrayList<String> list  = new ArrayList<String>();
        ArrayList<String> list1  = new ArrayList<String>();


        while ((s = f.readLine())!=null)
        {
            list.add(s);
        }

        for (String x : list)
        {
            sss = x.split(" ");
            for (int j = 0; j < sss.length; j++)
            {
                list1.add(sss[j]);
            }
        }
        String name = "";

        for (int i =0 ; i < list1.size(); i++)
        {

            try
            {
                if (Integer.parseInt(list1.get(i)) % 1 == 0)

                {
                   int day = Integer.parseInt(list1.get(i));
                   int month = Integer.parseInt(list1.get(i + 1));
                   int year = Integer.parseInt(list1.get(i + 2));

                    Date birthDay = new GregorianCalendar(year, month-1, day).getTime();
                    PEOPLE.add(new Person(name, birthDay));
                    name = "";

                    i = i + 2;
                }

            }
            catch (Exception e)
            {
                name = name  + list1.get(i)+" ";
            }
        }
        f.close();

        for ( Person y : PEOPLE)
            System.out.println(y.getName() + y.getBirthday());
    }

}