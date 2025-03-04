package Arrays_medium;

public class code7 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = stockBuyAndSell(arr);
        System.out.println(ans);
    }
    
    public static int stockBuyAndSell(int[] arr){
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - min);
        }
        return maxProfit;
    }

}

// Brute Froce
// int maxProfit = 0;
// for (int i = 0; i < arr.length; i++) {
//     for (int j = i+1; j < arr.length; j++) {
//         if(arr[j]>arr[i]){
//             maxProfit = Math.max(arr[j] - arr[i], maxProfit);
//         }
//     }
// }
// return maxProfit;
