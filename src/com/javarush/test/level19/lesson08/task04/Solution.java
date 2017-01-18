package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream byteArrayInputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayInputStream);
        System.setOut(stream);
        testString.printSomething();

        String result = byteArrayInputStream.toString();
        System.setOut(console);
        int c=0;
        StringBuilder stringBuilder = new StringBuilder(result);
        String [] sss = result.split(" ");
        if (sss[1].equals("+")) { c=Integer.parseInt(sss[0])+Integer.parseInt(sss[2]);}
        if (sss[1].equals("-"))  c=Integer.parseInt(sss[0])-Integer.parseInt(sss[2]);
        if (sss[1].equals("*"))  c=Integer.parseInt(sss[0])*Integer.parseInt(sss[2]);
        System.out.println(Integer.parseInt(sss[0])+" "+sss[1]+" "+Integer.parseInt(sss[2])+ " = "+ c );



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

