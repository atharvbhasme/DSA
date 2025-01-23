package recursion;

import java.util.Scanner;

public class reverseArryaPrint {
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

        reverseArrayP(arr);
        sc.close();
    }

    public static void helper(int arr[], int counter){
        if(counter >= 0){
         System.out.print(arr[counter] + " ");
         helper(arr, counter-1);   
        }
        return;
    }

    public static void reverseArrayP(int arr[]) {
        // code here
        int counter = arr.length - 1;
        helper(arr, counter);
    }
}
