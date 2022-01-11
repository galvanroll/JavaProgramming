package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        // enter username & password = "Cydeo" , "Cydeo123" or "Your account is locked

        Scanner scan = new Scanner(System.in);
        // int attempt = 3;

        System.out.println("Enter username: ");
        String username = scan.next();

        System.out.println("Enter password: ");
        String password = scan.next();

        if(username.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempts = 3;
            while(!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0){

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter username: ");
                username = scan.next();

                System.out.println("Enter password: ");
                password = scan.next();
                attempts--;
            }

            if(username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked.");
            }
        }
        scan.close();
    }
}


