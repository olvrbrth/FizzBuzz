package com.olvrbrth.fizzbuzz.test;

import com.olvrbrth.fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnNumber1AsString1() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(1);

        Assert.assertEquals("1", n);
    }

    @Test
    public void shouldReturnNumber2AsString2() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(2);

        Assert.assertEquals("2", n);
    }

    @Test
    public void shouldReturnFizzForThree() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(3);

        Assert.assertEquals("Fizz", n);
    }

    @Test
    public void shouldReturnFizzForMultiplesOfThree() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(6);

        Assert.assertEquals("Fizz", n);
    }

    @Test
    public void shouldReturnBuzzForFive() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(5);

        Assert.assertEquals("Buzz", n);
    }


    @Test
    public void shouldReturnBuzzForMultiplesOfFive() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(10);

        Assert.assertEquals("Buzz", n);
    }


    @Test
    public void shouldReturnFizzBuzzFor15() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(15);

        Assert.assertEquals("FizzBuzz", n);
    }

    @Test
    public void shouldReturnFizzBuzzForMultiplesOfThreeAndFive() {
        FizzBuzz f = new FizzBuzz();

        String n = f.convert(30);

        Assert.assertEquals("FizzBuzz", n);
    }

}
