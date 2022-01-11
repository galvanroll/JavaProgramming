package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabccc";
        String result = ""; // a2b1c3d1

        for (int j = 0; j < str.length(); j++) { //each character from string

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character

                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;

            }
            result += ch;
            result += count;

        }
        System.out.println(result);
    }
}