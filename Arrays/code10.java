// union of two arrays
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array 1: ");
        int s = sc.nextInt();

        int[] arr1 = new int[s];

        System.out.println("Enter the elements of the array 1: ");
        for (int i = 0; i < s; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the array 2: ");
        int d = sc.nextInt();

        int[] arr2 = new int[d];

        System.out.println("Enter the elements of the array 2: ");
        for (int i = 0; i < d; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] ans = unionArrays(arr1, arr2);
       
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

    public static int[] unionArrays(int[] arr1, int[] arr2){
        //brute force approach
        // HashSet<Integer> hs = new HashSet<>();
        // int m = arr1.length;
        // int n = arr2.length;
        // for (int i = 0; i < m; i++) {
        //     hs.add(arr1[i]);
        // }
        // for (int i = 0; i < n; i++) {
        //     hs.add(arr2[i]);
        // }
        // Integer[] ans = hs.toArray(new Integer[0]);
        // return ans;

        // Two Pointer method
        int i = 0;
        int j = 0;
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr1[i]){
                    ansList.add(arr1[i]);
                }
                i++;
            }else{
                if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr2[j]){
                    ansList.add(arr2[j]);
                }
                j++;
            }
        }

        while (i<n1) {
            if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr1[i]){
                ansList.add(arr1[i]);
            }
            i++;
        }

        while (j<n2) {
            if(ansList.size() == 0 || ansList.get(ansList.size() - 1) != arr2[j]){
                ansList.add(arr2[j]);
            }
            j++;
        }

        int[] ans = new int[ansList.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = ansList.get(k);
        }
        return ans;
    }
}
