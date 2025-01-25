package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
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
        insertionS(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void insertionS(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while(j>0 && arr[j - 1]>arr[j]){
                int temp = arr[j - 1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }
}
