package basic_hashing;

import java.util.Scanner;

public class basichashing {
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

         // Pre computing       
        int[] hArray = new int[10];
        for (int i = 0; i < arr.length; i++) {
            hArray[arr[i]] += 1;
        }

        System.out.println("Number to find");
        int number = sc.nextInt();
        System.out.println(hArray[number]);

        sc.close();
    }
}
