package com.aop.before;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    public int add(int i, int j) {
        int r = i + j;

        return r;
    }

    public int sub(int i, int j) {

        return i;
    }

    public int mul(int i, int j) {

        return i;
    }

    public int div(int i, int j) {

        return i;
    }
}
