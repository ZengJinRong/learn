package com.company.solution;

/**
 * 5364. 按既定顺序创建目标数组
 */
public class Solution5364 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            int num = nums[i];
            int ind = index[i];
            if (ind < index.length - 1) {
                System.arraycopy(ans, ind, ans, ind + 1, index.length - ind - 1);
            }
            ans[ind] = nums[i];
        }
        return ans;
    }
}
