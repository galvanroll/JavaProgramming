package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        arr = addInteger(arr, 5); //{1,2,3,4,5}

        System.out.println(Arrays.toString(arr));


        System.out.println("-------------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

      

        System.out.println(Arrays.toString(arr2));

    }


    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }

        result[i] = element;

        return result;

    }

    public static void addDouble(double[] array, double element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (double each : array) {


        }


    }
}






