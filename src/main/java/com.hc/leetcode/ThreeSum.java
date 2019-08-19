package com.hc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <nums.length-2 ; i++) {
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            int sum=-nums[i];
            while (l<r){
                if (nums[l]+nums[r]==sum){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l<r&&nums[l]==nums[l+1])l++;
                    while (l<r&&nums[r]==nums[r-1])r--;
                    l++;
                    r--;
                }else if (nums[l]+nums[r]>sum){
                    while (l<r&&nums[r]==nums[r-1])r--;
                    r--;
                }else {
                    while (l<r&&nums[l]==nums[l+1])l++;
                    l++;
                }
            }
        }
        return result;
    }
}
