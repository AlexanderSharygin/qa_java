package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;



@RunWith(Parameterized.class)
public class LionParametrizedTest {

    @Mock
    Feline feline;

    private final String sex;
    private final boolean expected;


    public LionParametrizedTest(String sex,  boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }



    @Parameterized.Parameters
    public static Object[][] getDataForTests() {
        Object[][] objects = {
                {"Самец", true},
                {"Самка", false},
        };
        return objects;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);
    }
}
