package day05_Concantenation;

import java.sql.SQLOutput;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String jobTitle = "SDET";
        String company = "Apple Inc";
        String salary = "100000.58";

        String fullName = firstName + " " + lastName; //this is value... not a string of text.


    // Full name of the peron is _____

        System.out.println("Full name of the person is " + fullName);

    // ____ is __ years old

        System.out.println(fullName + " is " + age + " years old ");

        System.out.println(fullName + " is " + jobTitle + ", works at " +  company +" , and " + fullName + "'s salary is $"+salary);








    }

}
/* // Full name of the person is _______
        System.out.println("Full name of the person is " + fullName );

        //___ is __ years old
        System.out.println(fullName + " is " + age +" years old"  );

        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary


 */