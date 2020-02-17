package com.zipcodewilmington.assessment1.part5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer result = 0;
        String tempString = "";
        String sub = "";
//
//        for (int c = 0; c < input.length(); c++) {
//            for (int i = 1; i <= input.length() - c ; i++) {
//                sub = input.substring(c, c+i);
//                tempString += sub;
//                tempString += " ";
//            }
//        }

//        String[] tempArray = tempString.split( " ");
//        String[] tempArrayReversed = new String[tempArray.length];
//
//        for (String n: tempArray) {
//            int index = 0;
//            String currentWord = "";
//            for (int i = n.length()-1; i >= 0; i--) {
//                currentWord += n.charAt(i);
//                tempArrayReversed[index] = currentWord;
//                index++;
//            }
//        }

//        for (int p = 0; p < tempArray.length; p++) {
//            if(tempArray[p].equals(tempArrayReversed[p])){
//                result++;
//            }
//        }
//
//        System.out.println(tempString);
//        System.out.println(tempArrayReversed.toString());
        return result;
    }
}
