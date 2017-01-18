package com.javarush.test.level28.lesson06.home01;

/**
 * Created by Максим on 26-Nov-16.
 */
public class MyThread extends Thread
{
    private static int count=0;
    public synchronized static Integer incrementCount(){
        count++;
        if (count>10)
            return count-10;
        else return count;
    }
    public MyThread()
    {
i();
    }

    public MyThread(Runnable target)
    {
        super(target);
        i();
    }

    public MyThread(ThreadGroup group, Runnable target)
    {
        super(group, target);
        i();
    }

    public MyThread(String name)
    {
        super(name);
        i();
    }


    public MyThread(ThreadGroup group, String name)
    {

        super(group, name);
    i();
    }

    public MyThread(Runnable target, String name)
    {
        super(target, name);
    i();
    }

    public MyThread(ThreadGroup group, Runnable target, String name)
    {
        super(group, target, name);

    i();}

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize)
    {
        super(group, target, name, stackSize);
    i();
    }

    private void i(){

        int newPrior = incrementCount();
        if (newPrior>getThreadGroup().getMaxPriority()){
            newPrior=getThreadGroup().getMaxPriority();
        }
        setPriority(newPrior);
    }


}
