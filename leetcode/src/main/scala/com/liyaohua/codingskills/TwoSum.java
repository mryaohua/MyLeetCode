package com.liyaohua.codingskills;


import java.util.HashMap;
import java.util.Map;

//算法复杂度分析
//时间复杂度：Time complexity O(n)
//空间复杂度：
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int target=9;
        int[] res=twoSum(arr,target);
        for (int i : res){
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
