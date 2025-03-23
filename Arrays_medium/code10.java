import java.util.ArrayList;
import java.util.Collections;

public class code10 {
    public static void main(String[] args) {
        int[] arr = {61 ,61 ,17};
        ArrayList<Integer> ans = leadersInArray(arr);
        System.out.println(ans.toString());
    }

    public static ArrayList<Integer> leadersInArray(int[] arr){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            if(arr[i] >= maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}

 // Brute Force Appoach
//  ArrayList<Integer> ans = new ArrayList<Integer>();
//  int n = arr.length;
//  for (int i = 0; i < arr.length; i++) {
//      for (int j = i; j < arr.length; j++) {
//          if(arr[i] < arr[j]){
//              break;
//          }else{
//              if(j == n-1){
//                  ans.add(arr[i]);
//              }
//          }
//      }
//  }
//  return ans;
