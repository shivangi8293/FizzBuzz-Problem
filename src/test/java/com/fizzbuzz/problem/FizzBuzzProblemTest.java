package com.fizzbuzz.problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzProblemTest {

    FizzBuzzProblem fizzBuzzProblem= null;
    @Before
    public void setUp() throws Exception {
        fizzBuzzProblem= new FizzBuzzProblem();
    }

    @Test
    public void should_return_FizzBuzz_if_number_is_divisible_by_15(){

        assertEquals("fizzbuzz" , fizzBuzzProblem.getFizzBuzz(15));
        assertEquals("fizzbuzz" , fizzBuzzProblem.getFizzBuzz(45));

    }

    @Test
    public void should_return_Buzz_if_number_is_divisible_by_5(){

        assertEquals("buzz" , fizzBuzzProblem.getFizzBuzz(10));
        assertEquals("buzz" , fizzBuzzProblem.getFizzBuzz(80));
    }


    @Test
    public void should_return_Fizz_if_number_is_divisible_by_3(){

        assertEquals("fizz" , fizzBuzzProblem.getFizzBuzz(9));
        assertEquals("fizz" , fizzBuzzProblem.getFizzBuzz(27));

    }

    @Test
    public void should_return_number_if_number_is_not_divisible_by_3_5_15(){

        assertEquals("17" , fizzBuzzProblem.getFizzBuzz(17));
        assertEquals("-76" , fizzBuzzProblem.getFizzBuzz(-76));

    }


}