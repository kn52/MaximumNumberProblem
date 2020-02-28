package com.number.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maxNumber;
    @Before
    public void setUp() throws Exception{
        maxNumber=new MaximumNumber();
    }

    @Test
    public void givenFirstIntegerNumber_IsGreater_ShouldReturn_FirstNumber() {
        int maximum=maxNumber.getMaximum(8,4,5);
        Assert.assertEquals(8,maximum);
    }

    @Test
    public void givenSecondIntegerNumber_IsGreater_ShouldReturn_SecondNumber() {
        int maximum=maxNumber.getMaximum(6,9,3);
        Assert.assertEquals(9,maximum);
    }

    @Test
    public void givenThirdIntegerNumber_IsGreater_ShouldReturn_ThirdNumber() {
        int maximum=maxNumber.getMaximum(3,4,7);
        Assert.assertEquals(7,maximum);
    }

    @Test
    public void givenFirstFloatNumber_IsGreater_ShouldReturn_FirstNumber() {
        float maximum=maxNumber.getMaximum(8.7f,4.6f,5.5f);
        Assert.assertEquals(8.7f,maximum,0.0);
    }

    @Test
    public void givenSecondFloatNumber_IsGreater_ShouldReturn_SecondNumber() {
        float maximum=maxNumber.getMaximum(6.5f,9.9f,3.1f);
        Assert.assertEquals(9.9f,maximum,0.0);
    }

    @Test
    public void givenThirdFloatNumber_IsGreater_ShouldReturn_ThirdNumber() {
        float maximum=maxNumber.getMaximum(3.2f,4.6f,7.2f);
        Assert.assertEquals(7.2f,maximum,0.0);
    }
}

