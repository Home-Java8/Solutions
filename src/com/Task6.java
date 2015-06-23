package com;

/**
 * Created by alexandr on 23.06.15.
 */
public class Task6 {

    public static void main(String[] args) {
        String line = "Alex Vlad, Vitalik,,Jenifer JanaLusy Alisa,Nikita   1  aaa  2 bbbbbb 3    cccc  4 5 6     7     x";
        String[] divide = line.split("[,;:.!?\\s]+"); //String[] divide = line.split("[,;:.!?\\s]+");

        for (String d : divide)
            System.out.println( d );

//        StringTokenizer st = new StringTokenizer(line, "\t\n\r,.");
//        while (st.hasMoreTokens())
//            System.out.println( st.nextToken() );

//        System.out.println( checForWord(line, "Vlad") );
    }

//    static boolean checForWord(String line, String word){
//        return line.contains(word);
//    }
}
