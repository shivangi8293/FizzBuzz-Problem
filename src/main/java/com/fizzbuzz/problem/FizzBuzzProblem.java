package com.fizzbuzz.problem;

public class FizzBuzzProblem {

    public static void main(String[] args) {

    }

    public String getFizzBuzz(int number){
            if(number % 15 ==0 ){
                return "fizzbuzz";
            }
            else if(number % 5 == 0){
                return "buzz";
            }
        return "";
    }
}
