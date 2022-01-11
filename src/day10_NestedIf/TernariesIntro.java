package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); //String
        } else {
            System.out.println("Odd"); //String
        }

        System.out.println("--------------------------------------");

        String result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("--------------------------------------");

        int n1 = 5;

        String result3 = (n1 == 1)? "Monday" :(n1 == 2)? "Tuseday" :(n1 == 3)? "Wednesday" :(n1 ==4)? "Thursday"
                :(n1 == 5)? "Friday" :(n1 == 6)? "Saturday" :"Sunday";
        System.out.println(result3);


        System.out.println("---------------------------------------");

                /*
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        */
        // System.out.println((age >= 21)? "Eligible" :"Not Eligible");
        // OR

        int age = 23;

        String result2 = (age >= 21) ? "Eligible" : "Not Eligible";
        System.out.println(result2);

    }
}

