package number_system;

import java.util.HashMap;
import java.util.Scanner;

public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number");
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // Check if the next character exists and is larger
            if (i + 1 < s.length() && map.get(s.charAt(i + 1)) > current) {
                // Subtractive notation
                sum += map.get(s.charAt(i + 1)) - current;
                i++; // Skip the next character as it is already processed
            } else {
                sum += current;
            }
        }

        System.out.println("The integer value is: " + sum);

        sc.close();
    }
}
