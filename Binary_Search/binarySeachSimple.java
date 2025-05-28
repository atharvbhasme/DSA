package Binary_Search;

class binarySearchSimple {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int ans = binarySearch(arr, target);
        int ansRecursive = binarySearchRecursive(arr, target, arr.length - 1, 0);
        System.out.println(ans);
        System.out.println(ansRecursive);
    }
    
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
    
    public static int binarySearchRecursive(int[] arr, int target, int high, int low){
        if(low > high) return 0;
        int mid = (low + high)/2;
        
        if(target == arr[mid]){
            return mid;
        }else if(target < arr[mid]){
            return binarySearchRecursive(arr, target, mid-1, low);
        }else {
            return binarySearchRecursive(arr, target, high, mid + 1);
        }
    }
}