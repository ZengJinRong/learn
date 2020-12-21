package com.company.solution;

/**
 * 724. 寻找数组的中心索引
 */
public class Solution724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public int pivotIndex2(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int leftSum = nums[left];
        int rightSum = nums[right];
        while (left != right) {
            if (Math.abs(leftSum + nums[left] - rightSum) > Math.abs(rightSum + nums[right] - leftSum)) {
                rightSum += nums[right];
                right--;
            } else {
                leftSum += nums[left];
                left++;
            }
        }
        return leftSum == rightSum ? left : -1;
    }

}
