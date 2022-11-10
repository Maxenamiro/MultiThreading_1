package com.gmail.maxenamiro;

import java.math.BigInteger;

public class Factorial implements Runnable {

    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= this.number; i++) {
            System.out.println(th.getName() + " -> " + number + " ! = " + calculateFactorial(i));
        }
    }

    private BigInteger calculateFactorial(int n) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(new BigInteger("" + i));
        }
        return factorial;
    }
}