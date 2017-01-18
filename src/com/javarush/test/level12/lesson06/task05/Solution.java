package com.javarush.test.level12.lesson06.task05;

/* Классы Cat и Dog от Pet
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static abstract class Pet
    {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet
    {
        public  String getName()
        {
            String s = "cat";
            return s;
        }
        public  Pet getChild(){
            Cat c = new Cat();
            return c;
        }
    }

    public static class Dog extends  Pet
    {
        public String getName()
        {
            String s = "dog";
            return s;
        }

        public Pet getChild()
        {
            Dog d = new Dog();
            return d;
        }
    }

}
