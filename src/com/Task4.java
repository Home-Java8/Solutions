package com;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task4 {

    public static void main(String[] args) {
        for (int i = 1; i < 56; i++){
            // Вариант #1:
            func1();

            System.out.println();

            // Вариант #2:
            func2();
        }
    }

    // Вариант #1:
    static void func1(){
        for (int i = 1; i < 56; i++){
            if ((i%3) == 0 && (i%5) == 0)
                System.out.println("535353");
            else if ((i % 3) == 0)
                System.out.println("333");
            else if ((i % 5) == 0)
                System.out.println("55555");
            else
                System.out.println( i );
        }
    }

    // Вариант #2:
    static void func2() {
        for (int i = 1; i < 56; i++)
            System.out.println( (i%3 == 0 && i%5 == 0) ? "535353" : i%3 == 0 ? "333" : i%5 == 0 ? "55555" : i );
    }

}
