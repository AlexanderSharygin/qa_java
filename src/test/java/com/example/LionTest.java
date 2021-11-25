package com.example;



import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;

    @Mock
    Feline feline;

    @Before
    public void beforeTest() throws Exception {
        lion = new Lion("Самец", feline);
    }


    @Test
    public void testGetKittens() {
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        
    }


}






