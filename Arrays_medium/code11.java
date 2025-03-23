import java.util.HashSet;
import java.util.Set;

public class code11 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 6};
        int ans = longestSeq(arr);
        System.out.println(ans);
    }

    public static int longestSeq(int[] arr){
        int n = arr.length;
        if(n==0) return 1;
        int longest = 1;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for(int it:hs){
            if(!hs.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(hs.contains(x+1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
