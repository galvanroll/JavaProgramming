package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        // create a method that can find the maximum number b/t 100~200,

        //int maxNumber = max(a:100, b:200);

        System.out.println();

        // then multiply the maximum number by 2.

    }

        public static int max(int a, int b){

        int result = 0;

        if(a>b){
            result = a;
        }else{
            result = b;
        }

        return result;

        }



}
