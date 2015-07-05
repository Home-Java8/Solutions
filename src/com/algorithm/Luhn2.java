package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Lazarchuk Aleksandr
 * @version 1.0
 * @date 05/07/2015
 * {@link https://bitbucket.org/OpsIT/luhn-validation/commits/49927398716}
 * ***********************************************************************
 * The Luhn Algorithm:
 */
public class Luhn2 implements ILuhn2 {

    @Override
    public boolean checkLuhnAlgorithm(String card_number) throws IllegalArgumentException, IllegalStateException {
        List<String>  strListDigit = new ArrayList<>(Arrays.asList(card_number.split("")));
        List<Integer> intListDigit = strListDigit.stream().map(Integer::valueOf).collect(Collectors.toList());
        return (calculateLuhn(doubleEvenDigits(intListDigit)) % 10) == 0 ? false : true;
    }

    public List<Integer> doubleEvenDigits(List<Integer> numbers) {
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

    public Integer calculateLuhn(List<Integer> numbers) {
        return numbers.stream().mapToInt(number -> number++).sum();
    }









    public static void main(String[] args) {
        /* ***********************[ 0 ]*************************** */
        String card_number = "1234567";
        Luhn2 algorithm = new Luhn2();

        List<String> strListDigit = new ArrayList<String>(Arrays.asList(card_number.split("")));
        List<Integer> lDigit = strListDigit.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> actual_double_even_digits = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> expected_double_even_digits = Arrays.asList(2,2,6,4,1,6,5);

        /* ***********************[ 1 ]*************************** */
        if( algorithm.checkLuhnAlgorithm(card_number) )
            System.out.println("OK");
        else
            System.out.println("ERR");

        /* ***********************[ 2 ]*************************** */
        algorithm.doubleEvenDigits(lDigit).forEach(System.out::print);

        /* ***********************[ 3 ]*************************** */
        System.out.println();
        System.out.println( algorithm.calculateLuhn(algorithm.doubleEvenDigits(lDigit)) );
    }
}
