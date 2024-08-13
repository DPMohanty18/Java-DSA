class evennumber{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }


    //function to check if the number contains even number of digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits %2 == 0){
            return true;
        }
        return false;
    }

    //count the number of digits in a number
    static int digits(int num){
        int count = 0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
}