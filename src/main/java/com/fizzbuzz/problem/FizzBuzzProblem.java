package com.fizzbuzz.problem;

public class FizzBuzzProblem {

    public static void main(String[] args) {
    FizzBuzzProblem fizzBuzzProblem = new FizzBuzzProblem();


    fizzBuzzProblem.getFizzBuzz(15);

    fizzBuzzProblem.getFizzBuzz(9);

    fizzBuzzProblem.getFizzBuzz(10);

    fizzBuzzProblem.getFizzBuzz(17);
    }

    public String getFizzBuzz(int number){
        StringBuilder returnString = new StringBuilder("");
             if(number % 3 == 0){
                 returnString.append("fizz");
                }
            if(number % 5 == 0){
                returnString.append("buzz");
                }
        return returnString.length()>0 ? returnString.toString(): String.valueOf(number);
    }
}
