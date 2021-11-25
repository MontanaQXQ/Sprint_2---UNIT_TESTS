package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws  Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные","Птицы","Рыба");
        assertEquals(expected,actual);

    }

    @Test
    public void testGetFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected,actual);
    }

    @Test
    public void testGetKittens() {
        int actual = feline.getKittens();
        int expected = 100;
        assertEquals(expected,actual);
    }


}