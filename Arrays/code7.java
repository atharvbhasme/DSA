// Reverse the arraya
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
