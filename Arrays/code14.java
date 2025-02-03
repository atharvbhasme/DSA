package Arrays;

import java.util.Scanner;

public class code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findNumberAprrearsOnce(arr);
        System.out.println(ans);
        sc.close();
    }

    public static int findNumberAprrearsOnce(int[] arr){
        int n = arr.length;
        int[] hs = new int[n + 1];
        // pre store
        for (int i = 0; i < n; i++) {
            hs[arr[i]] += 1;
        }

        int ans = 0;
        for (int i = 0; i < hs.length; i++) {
            if (hs[i] == 1) {
                ans = i;
            }
        }
        return ans;
    }
}
