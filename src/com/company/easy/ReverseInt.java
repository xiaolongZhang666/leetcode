package com.company.easy;

/**
 * @author zhangxiaolong
 * @date 2020/6/12 下午2:51
 */
public class ReverseInt {
    public int reverse(int x){
        int res = 0;
        while (x != 0){
            int temp = x % 10;
            int newRes = res *10 + temp;
            //判断是否溢出，溢出返回0
            if ((newRes - temp) / 10 != res){
                return 0;
            }
            x = x / 10;
            res = newRes;
        }
        return res;
    }

    public int reverse2(int x){
        long res = 0;
        int flag= -1;
        if (x < 0) x = -x;
        else flag = 1;
        while (x != 0){
            int temp = x % 10;
            res = res * 10 +temp;
            x /= 10;
        }
        res = res * flag;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        return (int) res;
    }
}
