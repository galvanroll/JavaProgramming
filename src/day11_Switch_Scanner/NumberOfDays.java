package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 9;
        String result ="";

        if(number >= 1 && number <= 12){

            switch(number) {
                case 2:
                    result ="28 days";
                    break;
                    case 4: case 6: case 9: case 11: //applying or logic
                    result = "30 days";
                    break;

                default:
                    result = "31 days";
            }
            }else{
                result = "Invalid Number";
        }
        System.out.println(result);
    }
}
