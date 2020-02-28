package com.number.test;

public class MaximumNumber {

    public int getMaximum(Integer x, Integer y, Integer z) {
        Integer max=x;
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        return max;
    }

    public float getMaximum(Float x, Float y, Float z) {
        Float max=x;
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        return max;
    }
}
