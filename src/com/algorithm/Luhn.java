package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Lazarchuk Aleksandr
 * @version 1.0
 * @date 30/06/2015
 * {@link https://bitbucket.org/OpsIT/luhn-validation/commits/49927398716}
 * ***********************************************************************
 * The Luhn Algorithm:
 */
public class Luhn {

    public static final int LENGTH_CARD_NUMBER_MIN = 2;
    public static final int LENGTH_STRING_CARD_NUMBER_MAX = 16;

    public <T> boolean checkLuhnAlgorithm(T card_number) throws IllegalArgumentException, IllegalStateException {
        List lDigit = toDigitList( card_number );
        return isLuhnValid( calculateLuhn( addTwoDigitsForRes( doubleEvenDigits(lDigit)) ) );
    }

    private  <T> String toConvertString(T number){
        if( String.valueOf(number).indexOf(".") < 0 ) {
            return String.valueOf(number);
        }
        return String.valueOf(number).substring(0, String.valueOf(number).indexOf("."));
    }

    protected  <T> List<Integer> toDigitList(T number) throws IllegalArgumentException, IllegalStateException {
        if (number != null) {
            List<Integer> returnDigitArray = new ArrayList<>();
            for (Character ch : toConvertString(number).toCharArray()) {
                if (Character.isDigit(ch)) {
                    returnDigitArray.add(Integer.valueOf(ch.toString()));
                } else {
                    throw new IllegalArgumentException("incorrect type of number");
                }
            }
            if (LENGTH_CARD_NUMBER_MIN <= returnDigitArray.size() && returnDigitArray.size() <= LENGTH_STRING_CARD_NUMBER_MAX) {
                return returnDigitArray;
            } else {
                throw new IllegalStateException("Incorrect the digits number");
            }
        } else {
            throw new IllegalArgumentException("The number is null");
        }
    }

    /*  4 9 9 2 7 3 9 8 7 1 6  */
    protected void doubleEvenDigits2(List<Integer> numbers) {
        Collections.reverse(numbers);
//        numbers.forEach(number -> System.out.println(number));
//        System.out.println( numbers.stream().filter(number -> number % 2 == 0).mapToInt(number -> number * 2).sum() );

//        numbers.stream().filter(number -> number % 2 != 0).mapToInt(number -> number * 2).forEach(number -> System.out.println(number));

//        long counts = numbers.stream()
//                .filter(number -> number % 2 != 0)
//                .mapToInt(number -> number * 2)
//                .count();
//        System.out.println( counts );

//        numbers.forEach((number, count) -> System.out.println(number + ":" + count));
        numbers.stream().filter((number) -> number % 2 == 0).forEach(System.out::println);


//        ListIterator<Integer> numbersIterator = numbers.listIterator(numbers.size());
//        while(numbersIterator.hasPrevious())
//            System.out.println(numbersIterator.previous());
    }

    public void ccc(long aaa){
        System.out.println( aaa );
    }



    protected List<Integer> doubleEvenDigits(List<Integer> numbers) {
        int count = 1;
        for (int i = (numbers.size() - 1); 0 <= i; i--)
            if ((count++ % 2) == 0)
                numbers.set(i, (numbers.get(i) * 2));

        return numbers;
    }

    protected List<Integer> addTwoDigitsForRes(List<Integer> number) {
        for (int i = 0; i < number.size(); i++) {
            if (9 < number.get(i) ) {
                String digitsToStr = String.valueOf(number.get(i)).toString();
                number.set(i, (Integer.parseInt(digitsToStr.substring(0, 1)) + Integer.parseInt(digitsToStr.substring(1, 2))));
            }
        }

        return number;
    }

    protected Integer calculateLuhn(List<Integer> number) {
        int sum = 0;
        for (int num : number)
            sum += num;

        return sum;
    }

    protected boolean isLuhnValid(Integer sumLuhn) {
        if ((sumLuhn%10) == 0)
            return false;
        return true;
    }


    public static void main(String[] args) {
        /* *********************[ 1 ]******************** */
//        Luhn luhn = new Luhn();
////        luhn.checkLuhnAlgorithm("49927398716");
//
//        List numbers = luhn.toDigitList("49927398716");
//        luhn.doubleEvenDigits2(numbers);

        /* *********************[ 2 ]******************** */
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//        System.out.println(numbers.stream().mapToInt(number -> number++).sum());
//
//        String strNumbers = "1,2,3,4,5,6,7";
//        List<String> listNumbers = new ArrayList<String>(Arrays.asList(strNumbers.split(",")));
//        listNumbers.forEach(System.out::print);

        /* *********************[ 3.0 ]******************** */
        String card_number = "1234567890";
        char[] numbers = card_number.toCharArray();
        List lDigit = new ArrayList(Arrays.asList(numbers));
//        lDigit.forEach(System.out::print);

//        System.out.println( lDigit.get(0) );
        for (char number:numbers)
            System.out.print(number);

        /* *********************[ 3.1 ]******************** */
        for (int number = (numbers.length - 1); 0 <= number; number-=2){
            if ( 9 < (Integer.valueOf(numbers[number])*2) ) {
                String digitsToStr = String.valueOf((Integer.valueOf(numbers[number])*2)).toString();
                numbers[number] = (char)(Integer.parseInt(digitsToStr.substring(0, 1)) + Integer.parseInt(digitsToStr.substring(1, 2)));
            } else {
                numbers[number] = (char)(Integer.valueOf(numbers[number])*2);
            }
        }

        /* *********************[ 4 ]******************** */
        String card_number2 = "1234567890";
        List lDigit2 = new ArrayList(Arrays.asList(card_number2.split("")));
        System.out.println( "\nsize: " + lDigit2.size() );
        lDigit2.forEach(System.out::print);

    }

}