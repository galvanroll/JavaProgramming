package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "JavaJavaJavaJavaJava";

        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) { // i: 0,1,2,3,4,5,6,7
            String eachSub = str.substring(i, i+4);
            //System.out.println(eachSub);

            if(eachSub.equals("Java")){
                frequency++;
            }

        }
        System.out.println(frequency);
    }
}
