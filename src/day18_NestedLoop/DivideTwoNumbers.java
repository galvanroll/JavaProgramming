package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 30; //a = 30-7=23, 23-7=16, 16-7=9
        int b = 7;

        int count = 0;

        while(a >= b){ // executes until condition is false... 3 times
            a -= b;
            count++;
        }
        System.out.println(count+ " with a remainder of " +a);


    }


}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 20 / 6 ==> 3 with the remainder of 2
 */