package cn.weifeng.sort;

/**
 * 快排
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 4, 3, 5, 0, 3, 7, 1, 9};

        partition(arr, 3);

        System.out.println("");

    }

    /**
     * 荷兰国旗问题
     *
     * @param arr
     * @param num
     */
    public static void partition(int[] arr, int num) {

        int l = -1;

        int r = arr.length;

        int i = 0;

        while (i < r) {
            if (arr[i] < num) {
                swap(arr, ++l, i++);
            } else if (arr[i] > num) {
                swap(arr, --r, i);
            } else {
                i++;
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int v = arr[i];
        arr[i] = arr[j];
        arr[j] = v;
    }
}
