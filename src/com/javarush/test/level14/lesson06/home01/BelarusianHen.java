package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Максим on 22-Sep-15.
 */
public class BelarusianHen extends Hen
{


    //int N =200;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 200;
    }
    @Override
    public String getDescription()
    {
        //String Sssss = Country.BELARUS;
        return  super.getDescription() + " Моя страна - " + Country.BELARUS+ ". Я несу "+ getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}


