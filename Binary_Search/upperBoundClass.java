package Binary_Search;

public class upperBoundClass {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3, 4, 4, 6 ,8, 9, 12, 99};
        int target = 5;
        int ansBruteFroce = upperBoundBruteFroce(arr, target);
        int ansOptimised = upperBoundOptimised(arr, target);
        System.out.println("bruteForce ans " + ansBruteFroce);
        System.out.println("optimised ans " + ansOptimised);
    }

    public static int upperBoundBruteFroce(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                return i;
            }
        }
        return arr.length - 1;
    }

    public static int upperBoundOptimised(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length -1;
        while(low >= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = mid;

                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
