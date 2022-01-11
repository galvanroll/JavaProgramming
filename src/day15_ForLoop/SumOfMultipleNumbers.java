package day15_ForLoop;

import java.util.Scanner;

public class SumOfMultipleNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        // +1 +2 +3...

        for (int i = 1; i < 101; i++) { // 1, 2, 3, 4...100
            sum += i;
        }
        System.out.println(sum); // 5050

        System.out.println("---------------------------------------------------");

        int total = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            total += scan.nextInt();
        }

        System.out.println("total = " + total);

        scan.close();

    }
}
