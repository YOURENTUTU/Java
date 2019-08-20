package com.hc.leetcode;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] tchars= t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(tchars);
        return Arrays.equals(chars,tchars);
    }
}
