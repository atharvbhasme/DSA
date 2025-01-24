package basic_hashing;

import java.util.Scanner;

public class basicCharacterHasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = sc.nextLine();

        int[] hashArray = new int[256];
        for (int i = 0; i < input.length(); i++) {
            hashArray[input.charAt(i)]++;
        }

        System.out.println("Enter the characters to indentify");
        
        char inputChar = sc.next().charAt(0);
        
        System.out.println(hashArray[inputChar]);

        sc.close();
    }
}
