package Binary_Search;

public class floorAndCeilClass {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 5;
        int[] ans = floorAndCeil(arr, target);
        System.out.println("floor is "+ ans[0] + " cieling is " + ans[1]);
    }

    public static int[] floorAndCeil(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int floor = -1;
        int ciel = -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return new int[]{target, target};
            }else if(arr[mid] < target){
                floor = arr[mid];
                high = mid - 1;
            }else{
                ciel = arr[mid];
                low = mid + 1;
            }
        }
        return new int[]{floor, ciel};
    }
}
