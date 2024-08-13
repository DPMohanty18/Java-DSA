class OrderAgnosticBS{
    public static void main(String[] args) {
        int[] arr = {-23,-16,0,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 2;
        int ans = oBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int oBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether the array is sorted in asc or desc order
        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            //find the middle element
            int mid = start+ (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}