package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mergSort {
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

        mSort(arr, 0, arr.length -1);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void mSort(int[] arr, int low, int high){
        if(low == high) return;
        int mid = (low + high) / 2;
        mSort(arr, low, mid);
        mSort(arr, mid + 1, high);
        merg(arr, low, mid, high);
    }

    public static void merg(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }

        for (int index = low; index <= high ; index++) {
            arr[index] = temp.get(index - low);
        }
    }
}
