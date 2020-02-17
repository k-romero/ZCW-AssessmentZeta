package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int result = 0;
        int remainder = 0;
        int tempNumber = 0;
        int counter = 0;
        if(j > k){
            result = k;
        }else if (k/j == k){
            result = k;
        }else if (k%j == 0){
            result =1;
        }else if (k > j){
            remainder = k%j;
            tempNumber = k - remainder;
            while (tempNumber != 0){
                tempNumber = tempNumber -j;
                counter++;
            }
            result = counter+remainder;
        }
        return result;
    }
}
