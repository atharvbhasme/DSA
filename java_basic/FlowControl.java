package java_basic;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        System.out.println("Java Flow Control");

        Scanner sc  = new Scanner(System.in);

        // if else ladder
        int i = sc.nextInt();
        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");
            // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");
            // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");
        else
            System.out.println("i is not present\n");
        System.out.println("Outside if-else-if");

        //For each loop
//        int[] arr = {1,3,4,5,32,6,23,34,21,12,34,345};
//
//        for(int j:arr){
//            System.out.println(j);
//        }

        //break and continue in java

        for (int j = 0; j < 10; j++) {
            System.out.println("running");
            if(j == 5){
             System.out.println(j);
             break;
            }
        }

        for (int j = 0; j < 10; j++) {
            if ( j == 5){
                continue;
            }
            System.out.println("Running for continue "+ j);
        }
        sc.close();
    }
}
