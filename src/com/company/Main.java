package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        int[] nums = {0,2,4,5,9};
        int target = 9;
        main.twoSum(nums, target);
    }

    //暴力搜索，时间复杂度n*n，空间复杂度1
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //hashmap，以空间换取时间，时间复杂度n，空间复杂度n
    public int[] twoSumMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
