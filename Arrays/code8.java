package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroToEnd(arr);

        System.out.println(Arrays.toString(arr));
        sc.close(); 
    }

    public static void moveZeroToEnd(int[] arr){
        // Brute Force Solution
        // ArrayList<Integer> nonZero = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]!=0){
        //         nonZero.add(arr[i]);
        //     }
        // }

        // int listSize = nonZero.size();
        // for (int i = 0; i < arr.length; i++) {
        //     if(i<listSize){
        //         arr[i] = nonZero.get(i);
        //     }else{
        //         arr[i] = 0;
        //     }
        // }

        // Two Pointer appraoch
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == 0){
                i = j;
                break;
            }
        }
        
        if(i == -1) return;

        for (int j = i+1; j < arr.length; j++) {
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
}
