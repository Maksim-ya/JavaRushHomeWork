package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        //Thread t = new Thread(tt);

        tt.start();
        //TimeUnit.MINUTES.sleep(1);
       //tt.sleep(10000);
       tt.interrupt();

    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread
    {
        public  void  run()
        {
           Thread current = Thread.currentThread();
            while (!isInterrupted())



            {
                try
                {

                    Thread.sleep(1000);
                    System.out.println("Tik- Tak");
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }


            }


           // }
        }
    }
}
