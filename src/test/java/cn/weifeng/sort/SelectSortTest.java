package cn.weifeng.sort;

import cn.weifeng.common.CommonMethod;

public class SelectSortTest {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 5, 4, 6, 1, 2};
        sort(arr);
        System.out.println("");
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                CommonMethod.swap(arr, min, i);
            }
        }
    }
}
