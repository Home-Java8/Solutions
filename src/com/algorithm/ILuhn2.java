package com.algorithm;

import java.util.List;

/**
 * @author Lazarchuk Aleksandr
 * @date 30/06/2015
 * {@link https://bitbucket.org/OpsIT/luhn-validation/commits/49927398716}
 * *****************************
 * The interface Luhn Algorithm:
 */

public interface ILuhn2 {

    /**
     * (Behavior #1) Double every second digit, from the rightmost digit
     *
     * @param numbers
     * @return
     */
    public List<Integer> doubleEvenDigits(List<Integer> numbers);

    /**
     * (Behavior #2) If in the process of doubling the value is greater than 9, add the two digits of the result
     *
     * @param numbers
     * @return
     */
    public Integer calculateLuhn(List<Integer> numbers);

    /**
     * (Behavior #3) Sum all digits
     *
     * @param card_number
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     */
    public boolean checkLuhnAlgorithm(String card_number) throws IllegalArgumentException, IllegalStateException;

}
