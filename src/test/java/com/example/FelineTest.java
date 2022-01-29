package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;


public class FelineTest {

  private Feline feline;

    @Before
    public void beforeTest()
    {
        feline = new Feline();
    }

    @Test
    public void eatMeatCorrectValuesReturned() throws Exception
    {

        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Incorrect food values were returned", actual, expected);
    }

    @Test
    public void getFamilyCorectValueReturned()
    {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals("", actual, expected);
    }

    @Test
    public void getKittensCorrectValueReturned()
    {
        int actual = feline.getKittens();
        int expected =1;
        Assert.assertEquals("Incorrect KittenCount value returned",expected, actual);
    }

    @Test
    public void getKittensWithIntArgumentCorrectValueReturned()
    {
        int actual = feline.getKittens(5);
        int expected =5;
        Assert.assertEquals("Incorrect KittenCount value returned",expected, actual);
    }
}