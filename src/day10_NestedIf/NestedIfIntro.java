package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int age = 19;
        boolean hasId = true;

        if (hasId) { // if the person has ID

            if (age >= 21) { // if the person is 21 or older
                System.out.println("Is Eligible to buy alcohol");
            } else { // if the person is less than 21
                System.out.println("Not eligible to buy alcohol");
            }

        } else { // if the person does not have ID
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("------------------------------------------");

        // monday ~ sunday
        int number = 7;

        if(number >=1 && number <= 7){ // pre-condition
            if(number == 1){
                System.out.println("Monday");
            }else if(number == 2){
                System.out.println("Tuesday");
            }else if(number == 3){
                System.out.println("Wednesday");
            }else if(number == 4){
                System.out.println("Thursday");
            }else if(number == 5){
                System.out.println("Friday");
            }else if(number == 6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{
            System.out.println("Invalid Number");

        }
    }
}
