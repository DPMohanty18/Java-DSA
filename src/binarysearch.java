class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {-23,-16,0,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 14;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    //return index
    //return -1 if it doesn't find the target
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            //find the middle element
            //int mid = (start+end)/2; might possible that the (start+end) can exceed the range of integers in java
            int mid = start+ (end-start) / 2;

            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                //answer found
                return mid;
            }
        }
        return -1;
    }
}