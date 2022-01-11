package day26_CustomMethodaPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] numbers = {100,200, 300, 400, 500, 600};


        System.out.println();
    }

    public static int[] removeElements(int[] array, int index){

            if (index < 0 || index > array.length - 1) {
                System.err.println("Invalid Index: " + index);
                System.exit(0);

            }
            int[] result = new int[array.length - 1];

            int j = 0;
            for (int each : array) {
                if (each == array[index]) {
                    continue;
                }
                result[j++] = each;
            }
            return result;
        }

}

