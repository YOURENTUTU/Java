package com.hc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int n) {
        traceBack(k,n,0,1,new LinkedList<>());
        return res;
    }

    private static void traceBack(int k, int n, int sum, int begin, LinkedList<Integer> list) {
        if (k==0){
            if (n==sum){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = begin; i < 10; i++) {
            list.add(i);
            traceBack(k-1,n,sum+i,begin+1,list);
            list.removeLast();
        }
    }

}
