package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "xcodeX";

        String result = str.replace("x", "a").replace("X", "a");
        System.out.println(result);

        input.close();
    }
}
