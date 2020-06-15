package com.company.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zhangxiaolong
 * @date 2020/6/15 上午10:56
 */
public class MergeTwoArray {
    //两数组合并，然后排序
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] nums_copy = new int[m];
        System.arraycopy(nums1, 0 , nums_copy, 0, m);

        int p1 = 0;
        int p2 = 0;
        //num1的指针
        int p = 0;

        while ((p1 < m) && (p2 < n)){
            nums1[p++] = nums_copy[p1] < nums2[p2] ? nums_copy[p1++] : nums2[p2++];
        }

        //若p1 > m，则需要继续
        if (p1 < m)
            System.arraycopy(nums_copy, p1, nums1, p1+p2, m + n- p1 - p2);

        //若p2 > n，则需要继续
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m+n-1;

        while ((p1 >= 0) && (p2 >= 0)){
            nums1[p--] = nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2 +1);
    }

}
