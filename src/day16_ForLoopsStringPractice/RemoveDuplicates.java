package day16_ForLoopsStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbcc"; // final result ==> abc

        String result = ""; // abc

        for (int i = 0; i < str.length(); i++) {  // i: represents all the index numbers of str (starting from 0)
            String ch = "" + str.charAt(i); // represents each Character of str

            if( !result.contains(ch) ) { // if the character is not contained in the result
                result += ch; // the character will be added to the result

        }

        }

        System.out.println(result);
    }
}
