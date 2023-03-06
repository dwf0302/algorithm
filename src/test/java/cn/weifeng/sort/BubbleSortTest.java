package cn.weifeng.sort;

import cn.weifeng.common.CommonMethod;

public class BubbleSortTest {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 5, 4, 6, 1, 2};
        bubbleSort(arr);
        System.out.println("");
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    CommonMethod.swap(arr, j, j + 1);
                }
            }
        }
    }
}
