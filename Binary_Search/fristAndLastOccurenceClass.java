package Binary_Search;

public class fristAndLastOccurenceClass {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;
        int[] ans = firstAndLastOccurence(arr, target);
        System.out.println("frist occurence is "+ ans[0] + " and last occurece is "+ ans[1]);
    }

    public static int[] firstAndLastOccurenceBruteForce(int[] arr, int target){
        int n = arr.length;
        int FOI = 0;
        int LOI = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                FOI = i;
                break;
            }
        }
        for (int j = n-1; j >= 0; j--) {
            if(arr[j] == target){
                LOI = j;
                break;
            }
        }
        return new int[]{FOI, LOI};
    }

    public static int[] firstAndLastOccurence(int[] arr, int target){
        int n = arr.length;
        int FOI = 0;
        int LOI = 0;
        int low = 0;
        int high = n - 1;
        
        // find the first lower occurence
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                FOI = mid;
                high = mid -1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }

        // Find the last occutence index
        low = 0;
        high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] ==  target){
                LOI = mid;
                low = low + 1;
            }else if(arr[mid] < target){
                low  = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return new int[]{FOI, LOI};
    }

}
