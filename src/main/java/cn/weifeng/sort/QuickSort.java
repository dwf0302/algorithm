package cn.weifeng.sort;

/**
 * 快排
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 4, 3, 5, 3};

        // int[] partition = partition(arr, -1, arr.length - 1);

        sort(arr, 0, arr.length - 1);
        System.out.println("");

    }


    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // 让数更加随机 可改进快排效率
            int[] p = partition(arr, l, r);
            sort(arr, l, p[0] - 1);
            sort(arr, p[1] + 1, r);
        }
    }

    /**
     * 荷兰国旗问题
     *
     * @param arr
     * @param l
     * @param r
     */
    public static int[] partition(int[] arr, int l, int r) {
        int L = l - 1;
        int R = r;
        while (l < R) {
            if (arr[l] > arr[r]) {
                swap(arr, l, --R);
            } else if (arr[l] < arr[r]) {
                swap(arr, ++L, l++);
            } else {
                l++;
            }
        }
        swap(arr, r, R);
        return new int[]{L + 1, R};
    }

    public static void swap(int[] arr, int i, int j) {
        int v = arr[i];
        arr[i] = arr[j];
        arr[j] = v;
    }
}
