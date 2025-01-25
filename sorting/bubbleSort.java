package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = 0;

        if (sc.hasNextInt()) {
            s = sc.nextInt();
        }

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        bubbleS(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();   
    }

    public static void bubbleS(int[] arr){
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
