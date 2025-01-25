package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
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
        System.out.println(Arrays.toString(selectionS(arr)));
        sc.close();
    }

    public static int[] selectionS(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for(int j = i + 1; j < len; j++ ){
               if(arr[j] < arr[min]){
                  min = j;
               }
            }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp; 
            
        }
        return arr;
    }
}
