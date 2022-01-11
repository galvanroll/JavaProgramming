package day13_String;

import java.util.Scanner;

public class Sentence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();

         char f = (sentence.charAt(0));
         char l = (sentence.charAt(sentence.length() - 1));

        System.out.println(f + " " + l);

        scan.close();
    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
*/