package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'A';
        String result = "";

        switch (ch){  // apply or logic in the statement

            case 'A':
                case'B':
                    case 'C':
                        case 'D':
                            result = "Passed";
                            break;

                            default:
                    result = "Failed";
        }
        System.out.println(result);
    }
}
