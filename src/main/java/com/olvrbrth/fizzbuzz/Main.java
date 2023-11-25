package com.olvrbrth.fizzbuzz;

public class Main {

    // https://tddmanifesto.com/exercises/
    public static void main(String[] args) {
        FizzBuzz f = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            String n = f.convert(i);
            System.out.println(n);
        }
    }
}
