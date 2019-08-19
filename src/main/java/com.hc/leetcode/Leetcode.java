package com.hc.leetcode;

public class Leetcode {
    public static void main(String[] args) {
       int[][] res=IntervalIntersection.intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}},new int[][]{{1,5},{8,12},{15,24},{25,26}});

        for (int i[]:
             res) {
            for (int j:
                 i) {
                System.out.println(j);
            }
        }
    }
}