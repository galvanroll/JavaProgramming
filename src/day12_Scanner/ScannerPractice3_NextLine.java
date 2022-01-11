package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        //123Enter
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language:");
        String programming = input.nextLine();

        input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt(); // 24Enter

        System.out.println("Enter School name:");
        String schoolName = input.nextLine(); //Enter

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
