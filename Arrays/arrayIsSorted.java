package Arrays;

import java.util.Scanner;

public class arrayIsSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1]<arr[i]){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Sorted");
        }else{
            System.out.println("not sorted");
        }
        
        sc.close();
    }
}