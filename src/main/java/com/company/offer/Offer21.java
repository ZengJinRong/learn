package com.company.offer;

/**
 * 面试题21. 调整数组顺序使奇数位于偶数前面
 */
public class Offer21 {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 1) {
                left++;
            } else if (nums[right] % 2 == 0) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }

    public int[] exchange2(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = ans.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[right] = num;
                right--;
            } else {
                ans[left] = num;
                left++;
            }
        }
        return ans;
    }
}
