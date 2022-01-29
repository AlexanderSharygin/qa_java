package com.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void beforeTest()
    {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundCorrectValueReturned()
    {
       String expected = "Мяу";
       String actual = cat.getSound();
       Assert.assertEquals("Incorrect getSound method result", expected, actual);
    }

    @Test
    public void getFoodVerifyInnerEntityMethodInvoked() throws Exception
    {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

}