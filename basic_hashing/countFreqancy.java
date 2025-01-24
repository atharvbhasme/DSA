package basic_hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countFreqancy {
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

        System.out.println(frequencyCount(arr));
        sc.close();
    }

    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array

        int n = arr.length;

    
        int[] freq = new int[n + 1];


        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num]++;
            }
        }

       
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(freq[i]);
        }

        return ans;
    }
}
