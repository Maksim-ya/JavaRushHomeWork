package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws  Exception{
        String fileName = args[0];
        int probel=0 ;
        int simvols=0;
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available()>0){
            if( inputStream.read()==32)
            { probel++;
            simvols++;}
            else  {simvols++;}}

           float f = (float) (probel/simvols)*100;
        System.out.println(String.format("%.2f",f));
        inputStream.close();
    }
}
