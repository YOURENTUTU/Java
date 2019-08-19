package com.hc.leetcode;

public class DayOfYear {
    //pass
    public int dayOfYear(String date) {
        int result=0;
        String[] dates=date.split("-");
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int year=Integer.parseInt(dates[0]);
        int month=Integer.parseInt(dates[1]);
        int day=Integer.parseInt(dates[2]);
        for (int i = 0; i <month-1 ; i++) {
            result+=months[i];
        }
        result+=day;
        if (year%4==0&&year%100!=0){
            if (month>2){
                result++;
            }
        }
        return result;
    }
}
