package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Саша on 05.07.2015.
 */
public class _Luhn2 {

    public boolean checkLuhnAlgorithm(String card_number) throws IllegalArgumentException, IllegalStateException {
//        List lDigit = new ArrayList(Arrays.asList(card_number.split("")));
        List<String> strListDigit = new ArrayList<String>(Arrays.asList(card_number.split("")));
        List<Integer> intListDigit = strListDigit.stream().map(Integer::valueOf).collect(Collectors.toList());

        return (calculateLuhn(doubleEvenDigits(intListDigit)) % 10) == 0 ? true : false;
    }

    protected List<Integer> doubleEvenDigits(List<Integer> numbers) {
        for (int number = (numbers.size() - 1); 0 <= number; number-=2){
            if (9 < (numbers.get(number)*2)) {
                String digitsToStr = String.valueOf((numbers.get(number)*2)).toString();
                numbers.set(number, (Integer.parseInt(digitsToStr.substring(0, 1)) + Integer.parseInt(digitsToStr.substring(1, 2))));
            } else {
                numbers.set(number, (numbers.get(number)*2));
            }
        }
        return numbers;
    }

//    protected List<Integer> doubleEvenDigits(List<Integer> numbers) {
//        for (int number = (numbers.size() - 1); 0 <= number; number-=2){
//            if (9 < (Integer.valueOf(numbers.get(number).toString())*2)) {
//                String digitsToStr = String.valueOf(Integer.valueOf(numbers.get(number).toString()) * 2).toString();
//                numbers.set(number, (Integer.parseInt(digitsToStr.substring(0, 1)) + Integer.parseInt(digitsToStr.substring(1, 2))));
//            } else {
//                numbers.set(number, (Integer.valueOf(numbers.get(number).toString())*2));
//            }
//        }
//        return numbers;
//    }

    protected Integer calculateLuhn(List<Integer> numbers) {
        return numbers.stream().mapToInt(number -> number++).sum();
    }

    public static void main(String[] args) {
        /* ***********************[ 1 ]*************************** */
        System.out.print("(1) lDigit: ");
        String card_number = "1234567";

//        List lDigit = new ArrayList(Arrays.asList(card_number.split("")));
        List<String> strListDigit = new ArrayList<String>(Arrays.asList(card_number.split("")));
        List<Integer> lDigit = strListDigit.stream().map(Integer::valueOf).collect(Collectors.toList());
        lDigit.forEach(System.out::print);

        /* ***********************[ 2 ]*************************** */
        System.out.println("\n(2) doubleEvenDigits: ");

        _Luhn2 luhn2 = new _Luhn2();
        luhn2.doubleEvenDigits(lDigit).forEach(System.out::print);

        /* ***********************[ 3.0 ]*************************** */
        System.out.println("\n(3.0) calculateLuhn: ");

        System.out.println( luhn2.calculateLuhn(luhn2.doubleEvenDigits(lDigit)) );

//        List<Integer> lNumbers = Arrays.asList(1, 2, 3, 4);
//        lDigit.stream().mapToInt(number -> Integer.valueOf(number)++).sum();

        /* ***********************[ 3.1 ]*************************** */
        System.out.println();

//        String[] stringArray = Arrays.copyof(objectList,objectList.length,String[].class);
//        String[] strings = list.stream().toArray(String[]::new);

//        List<String> stringList = new ArrayList<String>(Arrays.asList("10", "30", "40", "50", "60", "70"));
        List<String> stringList = new ArrayList<String>(Arrays.asList(card_number.split("")));
        List<Integer> integerList = stringList.stream().map(Integer::valueOf).collect(Collectors.toList());
        integerList.forEach(System.out::print);
    }
}
