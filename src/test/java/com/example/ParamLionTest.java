package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamLionTest {

    private final String checkedText;
    private final boolean expected;

    public ParamLionTest ( String checkedText,boolean expected){
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
        public static Object[][] getTextData(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
             };
        }


    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Feline feline;

    @Test
    public void chekLionManeTest() throws Exception {
        Lion lion = new Lion(checkedText,feline);
        assertEquals(expected, lion.doesHaveMane());
        System.out.println(lion.doesHaveMane());

    }



}
