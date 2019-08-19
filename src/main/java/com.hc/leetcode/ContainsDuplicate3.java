package com.hc.leetcode;

import java.util.TreeSet;

public class ContainsDuplicate3 {


    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        //超时
//        for(int i=0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (Math.abs((long)nums[i]-(long)nums[j])<=t){
//                    if (Math.abs(i-j)<=k){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;

        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i <nums.length ; i++) {
            Integer big=set.ceiling(nums[i]);
            if (big!=null && big<=t+nums[i]){
                return true;
            }

            Integer small=set.floor(nums[i]);
            if (small!=null && nums[i]<=t+small){
                return true;
            }

            set.add(nums[i]);
            if (set.size()>k){
                set.remove(nums[i-k]);
            }
        }

        return false;
    }
}
