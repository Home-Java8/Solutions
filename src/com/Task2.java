package com;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.print( func(5, 3));
    }


    public static int func(int a, int n){
        if(n > 1)
            return (a * func(a, (n-1)));
        else
            return a;
    }

}
