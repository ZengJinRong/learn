package com.company.Interview;

/**
 * 面试题 10.01. 合并排序的数组
 */
public class Interview1001 {
    public void merge(int[] A, int m, int[] B, int n) {
        int indexA = m - 1;
        int indexB = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (indexB < 0) {
                //TODO:理解 break 的原因
                break;
            } else if (indexA < 0) {
                A[i] = B[indexB];
                indexB--;
            } else if (A[indexA] >= B[indexB]) {
                A[i] = A[indexA];
                indexA--;
            } else {
                A[i] = B[indexB];
                indexB--;
            }
        }
    }


    public void merge2(int[] A, int m, int[] B, int n) {
        // 先确保将其中一个数组中的数字遍历完
        while (m > 0 && n > 0) {
            // 对比选出较大的数放在 m + n - 1 的位置，并将选出此数的指针向前移动
            A[m + n - 1] = A[m - 1] > B[n - 1] ? A[m-- - 1] : B[n-- - 1];
        }
        // 剩下的数都比已经遍历过的数小
        // 如果 m 不为 0，则 A 没遍历完，都已经在 A 中不用再管
        // 如果 n 不为 0，则 B 没遍历完，直接全移到 A 中相同的位置
        while (n > 0) {
            A[n - 1] = B[n - 1];
            n--;
        }
    }

    /**
     * TODO:理解解题思路
     */
    public void merge3(int[] A, int m, int[] B, int n) {
        // 先确保将其中一个数组中的数字遍历完
        while (m > 0 && n > 0) {
            // 对比选出较大的数放在 m + n - 1 的位置，并将选出此数的指针向前移动
            if (A[m - 1] > B[n - 1]) {
                A[m + n - 1] = A[m - 1];
                m--;
            } else {
                A[m + n - 1] = B[n - 1];
                n--;
            }

        }
        // 剩下的数都比已经遍历过的数小
        // 如果 m 不为 0，则 A 没遍历完，都已经在 A 中不用再管
        // 如果 n 不为 0，则 B 没遍历完，直接全移到 A 中相同的位置
        while (n > 0) {
            A[n - 1] = B[n - 1];
            n--;
        }
    }


    public void merge4(int[] A, int m, int[] B, int n) {
        int indexA = m - 1;
        int indexB = n - 1;
        int index = m + n - 1;
        // 先确保将其中一个数组中的数字遍历完
        while (indexA >= 0 && indexB >= 0) {
            // 对比选出较大的数放在 m + n - 1 的位置，并将选出此数的指针向前移动
            if (A[indexA] > B[indexB]) {
                A[index] = A[indexA];
                indexA--;
            } else {
                A[index] = B[indexB];
                indexB--;
            }
            index--;
        }
        // 剩下的数都比已经遍历过的数小
        // 如果 m 不为 0，则 A 没遍历完，都已经在 A 中不用再管
        // 如果 n 不为 0，则 B 没遍历完，直接全移到 A 中相同的位置
        while (indexB >= 0) {
            A[indexB] = B[indexB];
            indexB--;
        }
    }

}
