package com.number.test;

public class MaximumNumber {

    public int getMaximum(Integer x, Integer y, Integer z) {
        if(x.compareTo(y)>0 && x.compareTo(z)>0)
            return x;
        if(y.compareTo(z)>0)
            return y;
        return z;
    }

    public float getMaximum(Float x, Float y, Float z) {
        if(x.compareTo(y)>0 && x.compareTo(z)>0)
            return x;
        if(y.compareTo(z)>0)
            return y;
        return z;
    }

    public String getMaximum(String x, String y, String z) {
        if(x.compareTo(y)>0 && x.compareTo(z)>0)
            return x;
        if(y.compareTo(z)>0)
            return y;
        return z;
    }
}
