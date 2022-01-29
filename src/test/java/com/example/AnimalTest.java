package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;


public class AnimalTest {

    Animal animal;

    @Before
    public void beforeTest()
    {
        animal = new Animal();
    }

    @Test
    public void getFoodForPredatorCorrectListOfFoodReturned() throws Exception {
         List<String> actual = animal.getFood("Травоядное");
        List<String> expected = List.of("Трава", "Различные растения");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getFoodForHerbivoreCorrectListOfFoodReturned() throws Exception {
        List<String> actual = animal.getFood("Хищник");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFamilyCorrectStringReturned() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }
}