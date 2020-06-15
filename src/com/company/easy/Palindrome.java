package com.company.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangxiaolong
 * @date 2020/6/12 下午3:30
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        boolean flag = true;
        if (x < 0)
            flag = false;
        else {
            ReverseInt reverseInt = new ReverseInt();
            int res = reverseInt.reverse(x);
            if (res == x) {
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }

    public boolean isPalindrome2(int x){
        boolean result = true;
        String str = x + "";
        char[] chars = str.toCharArray();
        if(chars.length > 1){
            for (int i = 0; i <= chars.length/2 -1; i++) {
                if (chars[i] != chars[chars.length - 1 - i]){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
