package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class code15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum:");
        int sum = sc.nextInt();
        int ans = findLogestSubArray(arr, sum);
        System.out.println(ans);
        sc.close();
    }

    public static int findLogestSubArray(int[] arr, int k){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLen = 0;
        while(right<arr.length){
            sum += arr[right];
            
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++; 
        }
        return maxLen;
    }
}