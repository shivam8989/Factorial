package Recursion;

import java.util.*;
public class factorial {
    public static int printFcatorial(int n ){
        if(n==0){
            return 1;
        }
         int factorial  = printFcatorial(n-1);
        int f = n*factorial;
        return f;


    }

    public static void main(String args []){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.println(printFcatorial(n));

    }
}
