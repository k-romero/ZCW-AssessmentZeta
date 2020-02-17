package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int indexCount = 0;
        Integer[] buffer = new Integer[ints.length];
        for (Integer n: ints) {
            if(n % 2 != 0){
                buffer[indexCount] = n;
                indexCount++;
            }
        }
        Integer[] result = new Integer[indexCount];
        for (int i = 0; i < indexCount ; i++) {
            result[i] = buffer[i];
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int indexCount = 0;
        Integer[] buffer = new Integer[ints.length];
        for (Integer n: ints) {
            if(n % 2 == 0){
                buffer[indexCount] = n;
                indexCount++;
            }
        }
        Integer[] result = new Integer[indexCount];
        for (int i = 0; i < indexCount ; i++) {
            result[i] = buffer[i];
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int indexCount = 0;
        Integer[] buffer = new Integer[ints.length];
        for (Integer n: ints) {
            if(n % 3 != 0){
                buffer[indexCount] = n;
                indexCount++;
            }
        }
        Integer[] result = new Integer[indexCount];
        for (int i = 0; i < indexCount ; i++) {
            result[i] = buffer[i];
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int indexCount = 0;
        Integer[] buffer = new Integer[ints.length];
        for (Integer n: ints) {
            if(n % multiple != 0){
                buffer[indexCount] = n;
                indexCount++;
            }
        }
        Integer[] result = new Integer[indexCount];
        for (int i = 0; i < indexCount ; i++) {
            result[i] = buffer[i];
        }
        return result;
    }
}
