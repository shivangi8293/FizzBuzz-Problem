package com.fizzbuzz.problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzProblemTest {


    @Test
    public void testGetFizzBuzz_ForOutputFizzbuzz(){
        FizzBuzzProblem fizzBuzzProblem= new FizzBuzzProblem();
        String actual = fizzBuzzProblem.getFizzBuzz(15);

        assertEquals("fizzbuzz" , actual);

    }


}