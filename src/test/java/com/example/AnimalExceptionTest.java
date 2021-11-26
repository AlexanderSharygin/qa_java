package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalExceptionTest {
    @Test
    public void getFoodForWrongAnimalKindThrowsException()
    {
        Animal animal = new Animal();
        try
        {
           animal.getFood("IncorrectType");
        }
        catch (Exception e)
        {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());

        }
    }
}
