// Left Rotate array by K place
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

        System.out.println("How many places want to rotate ?");
        int k;
        k = sc.nextInt();
        leftRotateByK(arr, k);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void leftRotateByK(int[] arr, int k){
        int n = arr.length;
       reverseArray(arr, 0, k -1);
       reverseArray(arr, k, n-1);
       reverseArray(arr, 0, n-1);
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
