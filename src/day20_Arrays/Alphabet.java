package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26];

       /* alphabets[0] = 'Z';
        alphabets[1] = 'Y';
        alphabets[2] = 'X';
         */

        for (char i = 0, j = 'Z'; i < alphabets.length; i++, j--) {
            alphabets [i] = j;

        }

            System.out.println(Arrays.toString(alphabets));
        }
    }


