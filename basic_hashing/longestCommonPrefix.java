package basic_hashing;

import java.util.Scanner;

public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        String[] input = new String[size];
        System.out.println("Enter the Array elements");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextLine();
        }
        

        sc.close();;
    }
}
