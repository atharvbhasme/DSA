package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class code11 {
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

        int[] ans = intersectionArrays(arr1, arr2);
       
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

    public static int[] intersectionArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]){
                if(arr1[i] == arr2[j]){
                    ansList.add(arr1[i]);
                }
                i++;
            }else{
                if(arr1[i] == arr2[j]){
                    ansList.add(arr2[j]);
                }
                j++;
            }
        }

        int[] ans = new int[ansList.size()];
        for (int index = 0; index < ansList.size(); index++) {
            ans[index] = ansList.get(index);
        }
        return ans;
    }
}
