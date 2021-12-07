package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {


    @Mock
    Predator predator;
    

    @Test
    public void testGetSound() {
        Cat cat = new Cat(predator);
        String actualCatVoice = cat.getSound();
        String expectedCatVoice = "Мяу";
        assertEquals(expectedCatVoice,actualCatVoice);

    }


    @Test
    public void testGetFood() throws  Exception {
        Cat cat = new Cat(predator);
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные","Птицы","Рыба"));
        List <String> actual = cat.getFood();
        List <String> expected = List.of("Животные","Птицы","Рыба");
        assertEquals(expected,actual);
    }
}