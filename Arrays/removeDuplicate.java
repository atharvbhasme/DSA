package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        int k = removeDuplicates(arr);
        int[] ans = new int[k];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[i];
        }

        System.out.println(Arrays.toString(ans));
        sc.close();
    }

    public static int removeDuplicates(int[] nums) {
        int pointer = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[pointer] != nums[i]){
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer + 1;
    }
}
