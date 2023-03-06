package cn.weifeng.sort;

import cn.weifeng.common.CommonMethod;

public class InsertionSortTest {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 5, 4, 6, 1, 2};
        insertionSort(arr);
        System.out.println("");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                CommonMethod.swap(arr, j, j + 1);
            }
        }
    }
}
