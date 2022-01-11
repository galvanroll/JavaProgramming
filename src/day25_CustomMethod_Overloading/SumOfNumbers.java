package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

       int sum2 = sumOf2Numbers(10,20);
       System.out.println("sum2 = " + sum2);

       int sum3 = sumOf3Numbers(10, 20, 30);
        System.out.println("sum3 = " + sum3);
    }

    public static int sumOf2Numbers(int num1, int num2){
        return num1+num2;

    }

    public static int sumOf3Numbers(int num1, int num2, int num3){
    return num1+num2+num3;

    }


}
