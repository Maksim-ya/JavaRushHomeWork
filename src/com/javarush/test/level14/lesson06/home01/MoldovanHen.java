package com.javarush.test.level14.lesson06.home01;

/**
 * Created by ������ on 22-Sep-15.
 */
public class MoldovanHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 350;
    }
    @Override
    public String getDescription()
    {
        //String Sssss = Country.BELARUS;
        return  super.getDescription() + " ��� ������ - " + Country.MOLDOVA+ ". � ���� "+ getCountOfEggsPerMonth() + " ��� � �����.";
    }
}
