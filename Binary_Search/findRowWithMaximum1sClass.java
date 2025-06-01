package Binary_Search;

public class findRowWithMaximum1sClass {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1},
            {0,1,1},
            {0,0,0}
        };
        int ans = findRowWithMaximumOneBruteforce(arr);
        System.out.println("ans is "+ ans);
    }

    public static int findRowWithMaximumOneBruteforce(int[][] arr){
        int ans = -1;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]  == 1){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                ans = i;
            }
        }
        return ans;
    }

    public static int findRowWithMaximumOne(int[][] arr){
        int ans = -1;
        return ans;
    }
}
