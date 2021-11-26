package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionsTest {
    @Mock
    Feline feline;
    @Test
    public void doesHaveManeForLionWithWrongSexThrowsException()
    {
       try
       {
           Lion lion = new Lion("Test", feline);
       }
       catch (Exception e)
       {
           Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
       }
    }

}
