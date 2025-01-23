package recursion;

import java.util.Scanner;

public class pallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        System.out.println(isPalindrome(input));
        sc.close();
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.length() == 0){
            return true;
        }
        return helper(0, s);
    }

    public static boolean helper(int i, String s){
        if(i>=s.length() / 2) return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return helper(i+1, s);
    }
}
