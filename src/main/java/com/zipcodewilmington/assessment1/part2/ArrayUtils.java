package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer result = 0;
        for (Object n : objectArray) {
            if (n.equals(objectToCount)){
                result++;
            }
        }
        return result;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int counter = 0;
        String temp = "";
        for (int i = 0; i < objectArray.length; i++) {
            if(objectArray[i] != objectToRemove){
                counter++;
                temp += objectArray[i];
                temp += " ";
            }
        }
        Integer[] result = new Integer[counter];
        String[] tempArr = temp.split( " ");

        for (int j = 0; j < tempArr.length; j++) {
            result[j] = Integer.parseInt(tempArr[j]);
        }
        return result;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1;
        int tempCount;
        Integer mostCommon = (Integer) objectArray[0];
        Integer temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++)
        {
            temp = (Integer) objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++)
            {
                if (temp == objectArray[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                mostCommon = temp;
                count = tempCount;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int leastCount = getNumberOfOccurrences(objectArray, objectArray[0]);
        int tempCount = 0;
        Object currentLeast = new Object();
        for (Object n: objectArray) {
          tempCount = getNumberOfOccurrences(objectArray, n);
          if (tempCount <= leastCount) {
              leastCount = tempCount;
              currentLeast = n;
          }

        }
        return currentLeast;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] result = new Integer[objectArray.length + objectArrayToAdd.length];
        int index = 0;
        for (int i = 0; i <= objectArray.length-1; i++) {
            result[i] = (Integer) objectArray[i];
            index++;
        }
        for (int j = 0; j < objectArrayToAdd.length; j++) {
            result[index] = (Integer) objectArrayToAdd[j];
            index++;
        }
        return result;
    }
}
