package Binary_Search;

public class sqaureRootOfNBSClass {
    public static void main(String[] args) {
        int number = 28;
        int ans = findSquareRoot(number);
        System.out.println("ans is "+ ans);
    }

    public static int findSquareRoot(int n){
        int low = 0;
        int high = n;
        while(low <= high){
            long mid = (low + high)/2;
            long val = mid * mid;
            if(val <= (long)(n)){
                low = (int)(mid + 1);
            }else{
                high = (int)(mid-1);
            }
        }
        return high;
    }
}
