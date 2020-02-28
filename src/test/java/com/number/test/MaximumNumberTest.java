package com.number.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maxNumber;
    @Before
    public void setUp() {
        maxNumber=new MaximumNumber();
    }

    @Test
    public void givenFirstIntegerNumber_IsGreater_ShouldReturn_FirstNumber() {
        int maximum=maxNumber.getMaximumNumber(8,4,5);
        Assert.assertEquals(8,maximum);
    }

    @Test
    public void givenSecondIntegerNumber_IsGreater_ShouldReturn_SecondNumber() {
        int maximum=maxNumber.getMaximumNumber(6,9,3);
        Assert.assertEquals(9,maximum);
    }

    @Test
    public void givenThirdIntegerNumber_IsGreater_ShouldReturn_ThirdNumber() {
        int maximum=maxNumber.getMaximumNumber(3,4,7);
        Assert.assertEquals(7,maximum);
    }
}

