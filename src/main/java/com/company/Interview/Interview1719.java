package com.company.Interview;

/**
 * 面试题 17.19. 消失的两个数字
 */
public class Interview1719 {
    public int[] missingTwo(int[] nums) {
        int xor = 0, idx = 0;
        for (int num : nums) {
            xor ^= num;
            xor ^= ++idx;
        }
        xor ^= ++idx;
        xor ^= ++idx;
        int diff = xor & (-xor);
        int x = 0;
        idx = 0;
        for (int num : nums) {
            if ((diff & num) != 0) {
                x ^= num;
            }
            if ((diff & ++idx) != 0) {
                x ^= idx;
            }
        }
        if ((diff & ++idx) != 0) {
            x ^= idx;
        }
        if ((diff & ++idx) != 0) {
            x ^= idx;
        }
        return new int[]{x, xor ^ x};
    }
}
