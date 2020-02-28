package com.number.test;

public class MaximumNumber {

    public static <E extends Comparable<E>> E getMaximum(E x, E y, E z) {
        if(x.compareTo(y)>0 && x.compareTo(z)>0)
            return x;
        if(y.compareTo(z)>0)
            return y;
        return z;
    }
}
