package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 2;
        leftRotateByK(arr, k);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void leftRotateByK(int[] arr, int k){
        int n = arr.length;
        if(k>n) return;
        int[] duplicate = new int[n];
        for(int i:arr){
            duplicate[i] = arr[i];
        }
        for (int i = n-1; i >= k; i--) {
            arr[i] = arr[i-k];
        }
        for (int i = k - 1; i >= 0; i--) {
            arr[i] = duplicate[(n -1) - (i+1)];
        }
    }
}
