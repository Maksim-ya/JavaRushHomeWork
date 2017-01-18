package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Максим on 22-Sep-15.
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
        return  super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
