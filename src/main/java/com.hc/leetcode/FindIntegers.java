package com.hc.leetcode;

public class FindIntegers {
    //超时
    public static int findIntegers(int num) {
        int count=0;
        for (int i = 0; i <= num; i++) {
           if ((i&(i<<1))==0){
               count++;
           }
        }
        return count;
    }
}
