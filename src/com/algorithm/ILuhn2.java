package com.algorithm;

/**
 * Created by Саша on 05.07.2015.
 */
public interface ILuhn2 {

    /**
     * Convert number to the list;
     * 1. Double every second digit, from the rightmost digit: (12) = 2, (82) = 16, (32) = 6, (22) = 4, (9*2) = 18;
     * 2. Sum all digits (digits in parentheses are the products from Step 1): 6 + (2) + 7 + (1 + 6) + 9 + (6) + 7 + (4) + 9 + (1 + 8) + 4 = 70;
     * 3. Take the sum modulo 10: 70 mod 10 = 0; the account number is valid;
     *
     * @param card_number
     * @return
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     */
    public boolean checkLuhnAlgorithm(String card_number) throws IllegalArgumentException, IllegalStateException;

}
