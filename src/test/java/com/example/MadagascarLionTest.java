package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class MadagascarLionTest {
    MadagascarLion madagascarLion;


    @Mock
    Feline feline;

    @Before
    public void beforeTest() throws Exception {
      madagascarLion= new MadagascarLion(feline);
    }

    @Test
    public void testGetPlaceOfLiving() {
        String actual = madagascarLion.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        Assert.assertEquals("Incorrect place of living returned",expected,actual);
    }

    @Test
    public void testGetFriends() {
        List<String> actual = madagascarLion.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals("Wrong Friends names were returned",expected,actual);

    }

    @Test
    public void testGetKittens() {
        int actual = madagascarLion.getKittens();
        int expected =0;
        Assert.assertEquals("Kittens count value should be equal 0", expected,actual);
    }



    }
