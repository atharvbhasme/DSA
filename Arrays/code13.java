package Arrays;

import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findConsecutiveOne(arr); 
        System.out.println(ans);
        sc.close();
    }

    public static int findConsecutiveOne(int[] arr){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}
