package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;



    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
       Assert.assertEquals("Incorrect getSound method result", expected, actual);


    }

    @Test
    public void testGetMeat() throws Exception {

        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();

    }

}