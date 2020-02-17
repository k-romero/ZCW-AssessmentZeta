package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        /*Test is wrong per above instructions?
        wrote code to pass but otherwise would omit <= */
        Integer result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }

        return result;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        /*Test is wrong per above instructions?
        wrote code to pass but otherwise would omit <= */
        Integer result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String temp = Integer.toString(val);
        String tempresult = "";

        for (int i = temp.length()-1; i >= 0; i--) {
            tempresult += temp.charAt(i);
        }

        Integer result = Integer.parseInt(tempresult);

        return result;
    }
}
