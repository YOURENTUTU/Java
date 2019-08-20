package com.hc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DominantIndex {
    public static int dominantIndex(int[] nums) {
        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Arrays.sort(nums);
        if (nums[nums.length-1]>(nums[nums.length-2]*2)){
            return list.indexOf(nums[nums.length-1]);
        }
        return -1;
    }
}
