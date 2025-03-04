import java.util.Arrays;

public class code9 {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Step 1: Find the breakpoint where nums[i] < nums[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // If no breakpoint found, reverse the whole array (last permutation case)
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find the next larger element to swap with nums[ind]
        for (int i = n - 1; i > ind; i--) {  // Fix: Iterate till `n-1`
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }

        // Step 3: Reverse the portion after ind (to get the next lexicographic permutation)
        reverse(nums, ind + 1, n - 1);
    }

    // Utility function to reverse part of the array in-place
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Utility function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
