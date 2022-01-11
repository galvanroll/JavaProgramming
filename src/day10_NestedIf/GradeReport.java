package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 95;
        String result = ""; // temporary

        if (score >= 0 && score <= 100) { // <-- pre-condition. if the score is valid then 5 possibilities
            // you don't have to re-type score <= 100 in the first multi branch if block

            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80 && score <= 89) {
                result = "Great";
            } else if (score >= 70 && score <= 79) {
                result = "Good";
            } else if (score >= 60 && score <= 69) {
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else {
            result = "Invalid Score";
        }
        System.out.println(result); // must give print statement when using String result

        System.out.println("-----------------------------------------");

        String result2 = (score >= 0 && score <= 100)? (score >= 90)? "Excellent" : (score >= 80)? "Great"
                : (score >= 70)? "Good" : (score >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);

        }
    }

        /*
        Print out the grade of the Student.
        90~100: Excellent
        80~89: Great
        70~79: Good
        60~69: Passed
        0~59: Failed
         */

