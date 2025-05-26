//Zero matrix problem

import java.util.ArrayList;
import java.util.Arrays;

public class code12 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mtx  = new ArrayList<ArrayList<Integer>>();
        mtx.add(new ArrayList<>(Arrays.asList(1,1,1)));
        mtx.add(new ArrayList<>(Arrays.asList(1,0,1)));
        mtx.add(new ArrayList<>(Arrays.asList(1,1,1)));

        ArrayList<ArrayList<Integer>> ans = setMatrixZero(mtx);
      
        for(ArrayList<Integer> row: ans){
            for (Integer item: row){
                System.out.print(" " + item);
            }
            System.out.println();
        }
    }

    public static  ArrayList<ArrayList<Integer>> setMatrixZero(ArrayList<ArrayList<Integer>> mtx){
        int n = mtx.size();
        int m = mtx.get(0).size();

        int col0 = -1;

        for (int i = 0; i < n; i++) {
            for(int j= 0; j < m; j++){
                if( mtx.get(i).get(j) == 0){
                    mtx.get(i).set(0, 0);
                    
                    if(j != 0){
                        mtx.get(0).set(j, 0);
                    }else{
                        col0 = 0;    
                    }
                }
            }
        }

       for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if(mtx.get(i).get(j) != 0){
                // check for col & row:
                if (mtx.get(i).get(0) == 0 || mtx.get(0).get(j) == 0) {
                    mtx.get(i).set(j, 0);
                }
            }
        }        
       }

       if (mtx.get(0).get(0) == 0) {
        for (int j = 0; j < m; j++) {
            mtx.get(0).set(j, 0);
        }
    }
    if (col0 == 0) {
        for (int i = 0; i < n; i++) {
            mtx.get(i).set(0, 0);
        }
    }

       return mtx;
    }
}
