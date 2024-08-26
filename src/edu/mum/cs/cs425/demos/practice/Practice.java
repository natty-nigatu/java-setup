package edu.mum.cs.cs425.demos.practice;

public class Practice {

    public static void main(String[] args) {

        //printHelloWorld(new int[] {35,7,345,14,45,75,});

        System.out.println(findSecondBiggest(new int[] {9,20,34,44,59,7,8,99}));
    }


    private static int findSecondBiggest(int [] numbers){

        if(numbers.length <= 1)
            throw new IllegalArgumentException("At least 2 numbers");

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number: numbers) {
            if(number >= max){
                secondMax = max;
                max = number;
            }

        }

        return  secondMax;
    }

    private static void printHelloWorld(int[] numbers){

        String output = "";

        for (int number: numbers) {

            output = "";

            if(number % 5 == 0){
                output += "Hello";
            }

            if(number % 7 == 0) {
                output += "World";
            }

            if(output.length() > 0) {
                System.out.println(output);
            }
        }

    }
}
