package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
      Feline feline = new Feline();
       Lion lion = new Lion("Самка",feline);
       Cat cat = new Cat(feline);
        System.out.println(lion.getFood());
        System.out.println(lion.getKittens());
        System.out.println(cat.getFood());
        System.out.println(lion.doesHaveMane());
        System.out.println("кот говорит " + cat.getSound());
    }

}
