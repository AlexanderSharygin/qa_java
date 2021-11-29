package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionsTest {
    @Mock
    Feline feline;


    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void doesHaveManeForLionWithWrongSexThrowsException()throws InvalidSexNameException
       {
           exception.expect(InvalidSexNameException.class);
           exception.expectMessage("Используйте допустимые значения пола животного - самец или самка");
           new Lion("Test", feline);

    }

}
