import java.util.Arrays;

class linearsearch2d{
    public static void main(String[] args) {
        int[][] arr = {
                {25,895,86,39,73},
                {945,83,68},
                {54,56},
                {12,34,65,24}
        };
        int target = 65;
        int ans[] = lisearch2(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] lisearch2(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}