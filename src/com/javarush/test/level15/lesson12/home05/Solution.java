package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution ()
    {
    }
    public Solution (int i)
    {
    }
    public Solution (String s)
    {
    }
    private Solution (boolean b)
    {
    }
    private Solution (byte b)
    {
    }
    private Solution ( int i , boolean b)
    {
    }
    protected Solution (short s)
    {
    }
    protected Solution (int i,String s)
    {
    }
    protected Solution (String s, boolean b)
    {
    }
    Solution (Float f)
    {}
    Solution (Float f, boolean b)
    {}
    Solution (byte b, String s)
    {}
}

