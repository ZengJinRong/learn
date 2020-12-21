package com.company.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 1313. 解压缩编码列表
 */
public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int num = nums[i + 1];
            for (int j = 0; j < nums[i]; j++) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
