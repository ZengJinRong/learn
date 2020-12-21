package com.company.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 5178. 四因数
 */
public class Solution5178 {

    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int count = 0;
            int sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    sum += i;
                    if (i * i < num) {
                        count++;
                        sum += num / i;
                    }
                }
            }
            if (count == 4) {
                ans += sum;
            }
        }
        return ans;
    }

    /**
     * FIXME:超出时间限制
     */
    public int sumFourDivisors3(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            Set<Integer> temp = new HashSet<>();
            for (int i = 1; i < num; i++) {
                if (temp.size() > 4) {
                    break;
                }
                if (temp.contains(i)) {
                    break;
                }
                if (num % i == 0) {
                    temp.add(i);
                    int another = num / i;
                    if (i == another) {
                        break;
                    }
                    temp.add(another);
                }
            }
            if (temp.size() == 4) {
                list.addAll(temp);
            }
        }
        return list.stream().mapToInt(x -> x).sum();
    }
}
