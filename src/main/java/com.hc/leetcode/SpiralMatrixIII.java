package com.hc.leetcode;

public class SpiralMatrixIII {
    //pass
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] res=new int[R*C][2];
        int direction=0;
        int size=R*C;
        int step=1;
        int number=1;
        res[0]= new int[]{r0, c0};
        while (true){
            direction%=4;
            if (number==size){
                break;
            }
            for (int i = 0; i < step; i++) {
                if (direction==0){
                    c0+=1;
                }else if (direction==1){
                    r0+=1;
                }else if (direction==2){
                    c0-=1;
                }else {
                    r0-=1;
                }
                if (r0>=0&&r0<R&&c0>=0&&c0<C){
                    res[number]=new int[]{r0,c0};
                    number++;
                }
            }
            direction++;
            if (direction%2==0){
                step++;
            }
        }
        return res;
    }
}
