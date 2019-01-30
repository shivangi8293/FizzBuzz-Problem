package com.fizzbuzz.problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzProblemTest {


    @Test
    public void testGetFizzBuzz_ForOutputFizzbuzz(){
        FizzBuzzProblem fizzBuzzProblem= new FizzBuzzProblem();
        String actual = fizzBuzzProblem.getFizzBuzz(15);

        assertEquals("fizzbuzz" , actual);

    }

    @Test
    public void testGetFizzBuzz_ForOutputBuzz(){
        FizzBuzzProblem fizzBuzzProblem= new FizzBuzzProblem();
        String actual = fizzBuzzProblem.getFizzBuzz(10);

        assertEquals("buzz" , actual);

    }


    @Test
    public void testGetFizzBuzz_ForOutputFizz(){
        FizzBuzzProblem fizzBuzzProblem= new FizzBuzzProblem();
        String actual = fizzBuzzProblem.getFizzBuzz(9);

        assertEquals("fizz" , actual);

    }

    @Test
    public void testGetFizzBuzz_ForNoMatchingOutput(){
        FizzBuzzProblem fizzBuzzProblem= new FizzBuzzProblem();
        String actual = fizzBuzzProblem.getFizzBuzz(17);

        assertEquals("17" , actual);

    }


}