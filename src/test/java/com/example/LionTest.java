package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import java.util.List;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1,lion.getKittens());
    }

    @Test
    public void testDoesHaveManeMale() throws  Exception {
        Lion lion = new Lion("Самец",feline);
         assertTrue(lion.doesHaveMane());

    }

    @Test
    public void testDoesHaveManeFemale() throws  Exception{
        Lion lion = new Lion("Самка",feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws  Exception {
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные","Птицы","Рыба"));
        List <String> actual = lion.getFood();
        List <String> expected = List.of("Животные","Птицы","Рыба");
        assertEquals(expected,actual);
    }

}