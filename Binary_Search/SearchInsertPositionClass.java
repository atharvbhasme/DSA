package Binary_Search;

public class SearchInsertPositionClass {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,9,10,12,99,999};
        int target = 6;
        int ans = searchInsertPosition(arr, target);
        System.out.println("ans is " + ans);
    }

    public static int searchInsertPosition(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
