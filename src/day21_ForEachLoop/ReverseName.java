package day21_ForEachLoop;

public class ReverseName {

    public static void main(String[] args) {

        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming"};

        for (String each : names) { //for each loop... for ( : ){

            String reversed = "";

            for (int i = each.length()-1; i >= 0; i--) { // nested for loop... fori
            reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }





    }
}
