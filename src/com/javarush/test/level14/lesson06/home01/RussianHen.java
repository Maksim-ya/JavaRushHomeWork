package com.javarush.test.level14.lesson06.home01;

/**
 * Created by ������ on 22-Sep-15.
 */
public class RussianHen extends Hen
{
    //int N =100;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 100;
    }
    @Override
   public String getDescription()
    {
        //String Sssss = Country.RUSSIA;
        return  super.getDescription() + " ��� ������ - " + Country.RUSSIA + ". � ���� "+ getCountOfEggsPerMonth() + " ��� � �����.";
    }
}
