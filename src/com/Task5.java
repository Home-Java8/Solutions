package com;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task5 {

    public static void main(String[] args) {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int d : data)
            System.out.print( d );

        System.out.println();

        for(int i = 0; i < (data.length / 2); i++){
            data[i] = data[i] + data[(data.length-i-1)];
            data[(data.length-i-1)] = data[i] - data[(data.length-i-1)];
            data[i] = data[i] - data[(data.length-i-1)];
        }
        for (int d : data)
            System.out.print(d);

    }

}
