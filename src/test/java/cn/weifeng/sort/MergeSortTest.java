package cn.weifeng.sort;

public class MergeSortTest {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4, 5, 4, 6, 1, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("");
    }

    public static void mergeSort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int M = L + ((R - L) >> 1);

        mergeSort(arr, L, M);
        mergeSort(arr, M + 1, R);
        merge(arr, L, M, R);
    }

    private static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int index = 0;
        int p1 = L;
        int p2 = M + 1;

        if (p1 <= M && p2 <= R) {
            help[index++] = arr[p1] > arr[p2] ? arr[p2++] : arr[p1++];
        }

        while (p1 <= M) {
            help[index++] = arr[p1++];
        }

        while (p2 <= R) {
            help[index++] = arr[p2++];
        }

        for (int i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }

    }
}
