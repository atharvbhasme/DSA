package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class recursiveSelectionSort {
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
        recursiveSS(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void recursiveSS(int[] arr, int n, int index){
        if(n == index){
            return;
        }
        
        int k = minIndex(arr, index, n-1);
        if(k != index){
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
        }
        recursiveSS(arr, n , index + 1);
    }

    public static int minIndex(int a[], int i, int j){
        if(i == j){
            return i;
        }
        int k = minIndex(a, i+1, j);

        return (a[i] < a[k]) ? i : k; 
    }
}
