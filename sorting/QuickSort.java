package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        qSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        sc.close();
    }

    public static void qSort(int[] arr, int low, int high) {
        if (low < high) { // Base case
            int pivotIndex = findPivot(arr, low, high);
            qSort(arr, low, pivotIndex - 1); // Sort left part
            qSort(arr, pivotIndex + 1, high); // Sort right part
        }
    }

    public static int findPivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Move i forward until a number greater than pivot is found
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }
            // Move j backward until a number less than or equal to pivot is found
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }
            // Swap arr[i] and arr[j] if i < j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // Return the pivot index
    }
}
