package day27_WrapperClass;

public class Replace {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        replace(arr, 2, 30);
    }

    public static int[] replace(int[] array, int index, int newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);

        }
        array[index] = newElement;
        return array;

    }
}


     /*1. Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


      */


