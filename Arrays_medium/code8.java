package Arrays_medium;

import java.util.ArrayList;
import java.util.Arrays;

public class code8 {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
        rearrangeArrayPostiveNegative(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrangeArrayPostiveNegative(int[] arr){
        ArrayList<Integer> postiveNumber = new ArrayList<Integer>();
        ArrayList<Integer> negativeNumber = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                postiveNumber.add(arr[i]);
            }else{
                negativeNumber.add(arr[i]);
            }
        }
        int pst = 0;
        int ngt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i] = postiveNumber.get(pst);
                pst++;
            }else{
                arr[i] = negativeNumber.get(ngt);
                ngt++;
            }
        }
    }
}

 // Brute Force
//  ArrayList<Integer> postiveNumber = new ArrayList<Integer>();
//  ArrayList<Integer> negativeNumber = new ArrayList<Integer>();

//  for (int i = 0; i < arr.length; i++) {
//      if(arr[i] > 0){
//          postiveNumber.add(arr[i]);
//      }else{
//          negativeNumber.add(arr[i]);
//      }
//  }
//  // int pst = 0;
//  // int ngt = 0;
//  // for (int i = 0; i < arr.length; i++) {
//  //     if(i%2==0){
//  //         arr[i] = postiveNumber.get(pst);
//  //         pst++;
//  //     }else{
//  //         arr[i] = negativeNumber.get(ngt);
//  //         ngt++;
//  //     }
//  // }

//  // alternative approach
//  for (int i = 0; i < arr.length/2; i++) {
//      arr[i * 2] = postiveNumber.get(i);
//      arr[(i * 2)+1] = negativeNumber.get(i);
//  }

// This is solution for when array has equal number of postive and negative numbers
// int[] ans = new int[arr.length];
// int positive = 0;
// int negative = 1;
// for (int i = 0; i < ans.length; i++) {
//    if(arr[i] > 0){
//      ans[positive] = arr[i];
//      positive += 2;
//    }else{
//      ans[negative] = arr[i];
//      negative += 2;
//    }
// }
// return ans;