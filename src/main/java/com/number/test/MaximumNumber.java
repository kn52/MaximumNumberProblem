package com.number.test;

public class MaximumNumber<T extends Comparable<T>> {
    T first;
    T second;
    T third;

    public MaximumNumber(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public static <T extends Comparable<T>> T getMaximum(T x, T y, T z) {
        if(x.compareTo(y)>0 && x.compareTo(z)>0)
            return x;
        if(y.compareTo(z)>0)
            return y;
        return z;
    }

    public <T extends Comparable<T>> T getMax() {
        return (T) getMaximum(first, second, third);

    }


}
