package com;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task3 {

    public static void main(String[] args) {
        String str = "1233345";
        System.out.println( str.replace("3", "33") );
        System.out.println( str.replaceAll("3", "33") );
    }

}
