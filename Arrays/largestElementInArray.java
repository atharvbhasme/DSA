package Arrays;

import java.util.Scanner;

public class largestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        
        System.out.println(max);
        sc.close();
    }
}
