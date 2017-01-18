package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
"C:/Users/Максим/Desktop/222.txt"
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 =bf.readLine();
        String s2 =bf.readLine();
        DataInputStream inputStream = new DataInputStream(new FileInputStream(s1));
        ArrayList<Integer>  list = new ArrayList<Integer>();
        while (inputStream.available()>0){
            String[] s = inputStream.readLine().split(" ");
            for (int j = 0; j <s.length; j++) {
                 list.add((int) Math.round(Double.parseDouble(s[j])));}

        }


        BufferedWriter outputStream = new BufferedWriter(  new FileWriter(s2));

        for (int j = 0; j <list.size(); j++){
       // System.out.println(list.get(j));}
            outputStream.write(list.get(j).toString()+" ");}




        inputStream.close();
        outputStream.close();;
        bf.close();
    }
}
