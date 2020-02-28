package com.number.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maxNumber;

    @Test
    public void givenFirstIntegerNumber_IsGreater_ShouldReturn_FirstNumber() {
        maxNumber=new MaximumNumber(8,4,5);
        int maximum= (int) maxNumber.getMax();
        Assert.assertEquals(8,maximum);
    }

    @Test
    public void givenSecondIntegerNumber_IsGreater_ShouldReturn_SecondNumber() {
        maxNumber=new MaximumNumber(6,9,3);
        int maximum= (int) maxNumber.getMax();
        Assert.assertEquals(9,maximum);
    }

    @Test
    public void givenThirdIntegerNumber_IsGreater_ShouldReturn_ThirdNumber() {
        maxNumber=new MaximumNumber(3,4,7);
        int maximum= (int) maxNumber.getMax();
        Assert.assertEquals(7,maximum);
    }

    @Test
    public void givenFirstFloatNumber_IsGreater_ShouldReturn_FirstNumber() {
        maxNumber=new MaximumNumber(8.7f,4.6f,5.5f);
        float maximum= (float) maxNumber.getMax();
        Assert.assertEquals(8.7f,maximum,0.0);
    }

    @Test
    public void givenSecondFloatNumber_IsGreater_ShouldReturn_SecondNumber() {
        maxNumber=new MaximumNumber(6.5f,9.9f,3.1f);
        float maximum= (float) maxNumber.getMax();
        Assert.assertEquals(9.9f,maximum,0.0);
    }

    @Test
    public void givenThirdFloatNumber_IsGreater_ShouldReturn_ThirdNumber() {
        maxNumber=new MaximumNumber(3.2f,4.6f,7.2f);
        float maximum= (float) maxNumber.getMax();
        Assert.assertEquals(7.2f,maximum,0.0);
    }

    @Test
    public void givenFirstString_IsGreater_ShouldReturn_FirstString() {
        maxNumber=new MaximumNumber("zxcv","qwe","as");
        String maximum= (String) maxNumber.getMax();
        Assert.assertEquals("zxcv",maximum);
    }

    @Test
    public void givenSecondString_IsGreater_ShouldReturn_SecondString() {
        maxNumber=new MaximumNumber("qwe","zxcv","as");
        String maximum= (String) maxNumber.getMax();
        Assert.assertEquals("zxcv",maximum);
    }

    @Test
    public void givenThirdString_IsGreater_ShouldReturn_ThirdString() {
        maxNumber=new MaximumNumber("as","qwe","zxcv");
        String maximum= (String) maxNumber.getMax();
        Assert.assertEquals("zxcv",maximum);
    }

    @Test
    public void givenMoreThan_ThreeIntegerNumber_ShouldReturn_MaxNumber() {
        maxNumber=new MaximumNumber();
        int maximum= (int) maxNumber.maximum(8,4,1,5);
        Assert.assertEquals(8,maximum);
    }

    @Test
    public void givenMoreThan_ThreeFloatNumber_ShouldReturn_MaxNumber() {
        maxNumber=new MaximumNumber();
        float maximum= (float) maxNumber.maximum(3.2f,4.6f,2.2f,7.2f);
        Assert.assertEquals(7.2f,maximum,0.0);
    }

    @Test
    public void givenMoreThan_ThreeString_ShouldReturn_MaxString() {
        maxNumber=new MaximumNumber();
        String maximum= (String) maxNumber.maximum("as","qwe","zxcv","rst");
        Assert.assertEquals("zxcv",maximum);
    }

    @Test
    public void givenMoreThan_ThreeString_ShouldReturn_PrintMaxString() {
        maxNumber=new MaximumNumber();
        String maximum= (String) maxNumber.maximum("as","qwe","zxcv","rst");
        Assert.assertEquals("zxcv",maximum);
    }
}

