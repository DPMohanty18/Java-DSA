package LeetCode;

public class Leetcode2678{
    public static void main(String[] args) {
        String[] details = new String[15];
        details = new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }

    static int countSeniors(String[] details) {
        int result = 0;
        //for each loop
        for(String d : details){
            int age = Integer.parseInt(d.substring(11, 13));
            if (age > 60){
                result++;
            }
        }
//        for (int i = 0; i < details.length; i++) {
//            String d = details[i];
//            int age = Integer.parseInt(d.substring(11, 13));
//            if (age > 60) {
//                result++;
//            }
//        }

        return result;
    }
}