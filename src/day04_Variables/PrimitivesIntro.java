package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        //weight: 160 pounds
        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        //short salary = 100000; // 100000 is out of short range
        int salary = 100000;


        long asset = 3_333_333_333L;


        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;

        // # char is designed for single characters
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = '#';
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        boolean isEmployed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String first_name = "Muhtar";
        System.out.println("first_name = " + first_name);


    }

}
