package com.javarush.test.level14.lesson06.home01;

/**
 * Created by ������ on 22-Sep-15.
 */
public class UkrainianHen extends Hen
{
    @Override
  int getCountOfEggsPerMonth()
{
    return 250;
}
    @Override
    public String getDescription()
    {
        //String Sssss = Country.BELARUS;
        return  super.getDescription() + " ��� ������ - " + Country.UKRAINE+ ". � ���� "+ getCountOfEggsPerMonth() + " ��� � �����.";
    }
}
