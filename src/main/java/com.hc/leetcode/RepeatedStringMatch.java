package com.hc.leetcode;

import java.util.Arrays;

public class RepeatedStringMatch {
    public static int repeatedStringMatch(String A, String B) {
        //超时
//        int count=1;
//        String A1=A;
//        while (true){
//            if (A.length()>10000){
//                break;
//            }
//            if (A.length()>B.length()) {
//                if (A.contains(B)) {
//                    return count;
//                }
//            }
//            A+=A1;
//            count++;
//        }
//        return -1;
        String temp=A+A;
        int m=A.length();
        int n=B.length();
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        int i;
        if (m>n){
            i=temp.indexOf(B);
        }else {
            i=temp.indexOf(B.substring(0,m-1));
        }
        if (i==-1){
            return -1;
        }
        int count =0;
        int j=0;
        while (j<n){
            if (a[i]==b[j]){
                i++;
                if (i>=m){
                    count++;
                    i=0;
                }
                j++;
            }else {
                return -1;
            }
        }
        if (i!=0){
            count++;
        }
        return count;
    }
}
