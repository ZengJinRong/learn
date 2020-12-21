package com.company.offer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 面试题40. 最小的k个数
 */
public class Offer40 {
    /**
     * TODO：理解解题思路
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        int length = arr.length;
        int[] out = new int[k];
        if (length == k) {
            return arr;
        }
        if (k == 0) {
            return new int[0];
        }
        int[] line = new int[10001];
        for (int value : arr) {
            line[value]++;
        }
        a:
        for (int i = 0, count = 0; i < length; i++) {
            for (int j = 0; j < line[i]; j++) {
                out[count] = i;
                if (++count == k) {
                    break a;
                }
            }

        }
        return out;
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }


    /**
     * TODO：理解解题思路
     */
    public int[] getLeastNumbers3(int[] arr, int k) {
        if (k == 0)
            return new int[0];
        int len = arr.length;
        if (k == len)
            return arr;
        //对arr数组的前k个数建堆
        int[] heap = new int[k];
        System.arraycopy(arr, 0, heap, 0, k);
        buildHeap(heap);

        //对后面的数进行遍历，如果有比堆顶的数(这个堆中最大的一个数，如果比他大，那么说明这个数被淘汰了)，更新堆顶元素的值为这个更小的数，然后对堆进行维护，即还是要保证堆顶的元素是这个堆中最大的数。
        for (int i = k; i < len; i++) {
            if (arr[i] < heap[0]) {
                heap[0] = arr[i];
                heapify(heap, 0);
            }
        }
        //返回这个堆
        return heap;
    }

    //建堆。堆其实是一颗完全二叉树，用数组实现，具体可百度。节点i的父节点和子节点可通过如下的计算得到。
    //对于一个还没维护过的堆，从他的最后一个节点的父节点开始进行heapify,知道堆顶
    //parent = (i - 1) / 2; child1 = 2 * i + 1(左节点);, child2 = 2 * i + 2(右节点);
    private void buildHeap(int[] nums) {
        //最后一个节点
        int lastNode = nums.length - 1;
        //最后一个节点的父节点
        int startHeapify = (lastNode - 1) / 2;
        //开始heapify直到最后
        while (startHeapify >= 0) {
            heapify(nums, startHeapify--);
        }
    }

    //维护大顶堆的函数，和当前节点的左右节点比较，如果节点中有更大的数，那么交换，并继续对交换后的节点进行维护
    //i:要维护的节点。
    private void heapify(int[] nums, int i) {
        int len = nums.length;
        if (i >= len)
            return;
        //左右子节点
        int c1 = ((i << 1) + 1), c2 = ((i << 1) + 2);
        //假定节点i是这三个点(i节点，i节点的左子节点，i节点的右子节点)中最大的那个数
        int max = i;
        //如果左子节点比较大，max更新为max = c1;
        if (c1 < len && nums[c1] > nums[max])
            max = c1;
        //如果右子节点比较大，max更新为max = c2;
        if (c2 < len && nums[c2] > nums[max])
            max = c2;
        //如果最大的数不是节点i的话，那么heapify(nums, max)，即调整节点i的子树。
        if (max != i) {
            swap(nums, max, i);
            heapify(nums, max);
        }
    }
    //交换数组中i索引和j索引元素的位置
    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] + nums[j] - (nums[j] = nums[i]);
    }

    /**
     * TODO：理解解题思路
     * FIXME:耗时太长
     */
    public int[] getLeastNumbers4(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> (b - a));
        for (int i : arr) {
            if (queue.size() < k) {
                queue.add(i);
            } else {
                if (queue.peek() > i) {
                    queue.remove();
                    queue.add(i);
                }
            }
        }
        int[] ref = new int[k];
        int cnt = 0;
        while (queue.size() > 0) {
            ref[cnt++] = queue.remove();
        }
        return ref;
    }
}
