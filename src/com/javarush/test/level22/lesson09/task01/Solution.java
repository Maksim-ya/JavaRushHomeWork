package com.javarush.test.level22.lesson09.task01;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<Pair>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( new FileInputStream(fileName)));
        ArrayList<String> list = new ArrayList<String>();

        while (bufferedReader.ready())
        {
            list.addAll(Arrays.asList(bufferedReader.readLine().split(" ")));
        }
      for (int i =0; i<list.size();i++)
          for ( int j =i+1; j<list.size();j++ )
          {
              StringBuilder st = new StringBuilder(list.get(i));
              String s = st.reverse().toString();
              if (s.equals(list.get(j)))
              {
                  Pair pair = new Pair();
                  pair.first=list.get(i);
                  pair.second=list.get(j);
                  result.add(pair);
                  list.remove(j);
              }
          }


     for (Pair p : result)
         System.out.println(p);




    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
