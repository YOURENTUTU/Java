package com.hc.leetcode;


/**
 * 给定两个由一些闭区间组成的列表，每个区间列表都是成对不相交的，并且已经排序。
 * 返回这两个区间列表的交集。
 * */
public class IntervalIntersection {
    //pass
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int res[][] = new int[A.length+B.length][2];
        int count=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i][1]<B[j][0]){
                    break;
                }if (A[i][0]>B[j][1]){
                }else {
                    if (A[i][0]>B[j][0]){
                        res[count][0]=A[i][0];
                    }else {
                        res[count][0]=B[j][0];
                    }
                    if (A[i][1]>B[j][1]){
                        res[count][1]=B[j][1];
                    }else {
                        res[count][1]=A[i][1];
                    }
                    count++;
                }
            }
        }
        int[][] res1= new int[count][2];
        for (int i = 0; i < count; i++) {
            res1[i][0]=res[i][0];
            res1[i][1]=res[i][1];
        }
        return res1;
    }
}
