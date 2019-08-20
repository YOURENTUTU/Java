package com.hc.leetcode;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] A) {
        int max=0;
        if (A.length<=1){
            return false;
        }
        if (A[0]>A[1]){
            return false;
        }
        for (int i = 1; i < A.length-1; i++) {
            if (A[i]==A[i+1]){
                return false;
            }
            if (A[i]>A[i+1]){
                max=i;
                break;
            }
        }
        if (max==0){
            return false;
        }
        for (int i = max+1; i < A.length; i++) {
            if (A[i]<=A[i+1]){
                return false;
            }
        }
        return true;
    }
}
