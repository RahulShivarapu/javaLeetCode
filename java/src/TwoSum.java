package com.example.leetCode;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] res = twoSum(nums, target);
        for (int i : res) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        // int i=0;
        // int[] res = new int[2];
        int i=0;
        
        while (i<nums.length) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
            i++;
        }
        return new int[0];
    }

    }

