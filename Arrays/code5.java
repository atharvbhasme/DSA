// Left Rotate array by one place
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        leftRotate(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    
    public static void leftRotate(int[] arr){
        int n = arr.length;
        if(n==1|| n==0) return ;
        int lastElement = arr[n-1];
        for (int i = n -1; i >= 0; i--) {
            if (i == 0) {
                arr[i] = lastElement;
            } else {
                arr[i] = arr[i-1];
            }
        }
    }
}
