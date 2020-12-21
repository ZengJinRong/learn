package com.company.Interview;

/**
 * 面试题 05.07. 配对交换
 */
public class Interview0507 {
    public int exchangeBits(int num) {
        int odd = num & 0x55555555;
        int even = num & 0xaaaaaaaa;
        odd = odd << 1;
        even = even >>> 1;
        return odd | even;
    }
}
