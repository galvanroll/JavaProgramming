package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine(); //Java Programming

        scan.nextLine();
        System.out.println("Enter your building number");
        String building = scan.next(); //7925A Enter

        scan.nextLine();
        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println("Enter city name:");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zip code");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your country: ");
        String country = scan.nextLine();

        scan.close();

    }
}
