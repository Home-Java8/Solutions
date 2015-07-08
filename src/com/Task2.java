package com;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println( func(5, 3));

        System.out.println( func2(5, 3));
    }


    public static int func(int a, int n){
        if(n > 1)
            return (a * func(a, (n-1)));
        return a;
    }


    public static int func2(int a, int n){
        return n > 1 ? (a * func2(a,(n-1))) : a;
    }

}
