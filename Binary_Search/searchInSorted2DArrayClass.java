package Binary_Search;

public class searchInSorted2DArrayClass {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,23,34}
        };
        boolean ans = searchInSorted2DArray(arr, 9);
        System.out.println("index is "+ ans);
    }

    public static boolean searchInSorted2DArray(int[][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;
        int low = 0;
        int high = (m * n) - 1;
        while(low < high){
            int mid = (low + high)/2;
            int row = mid / m;
            int col = mid % n;
            if(arr[row][col] == target){
                return true;
            }else if(arr[row][col] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return false;
    }
}
