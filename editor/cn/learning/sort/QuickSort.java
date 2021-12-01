package editor.cn.learning.sort;


import java.util.Arrays;

/**
 * 快速排序
 *
 * @author DWF
 */
public class QuickSort {

    public static void main(String[] args) {

//        int[] testArr = new int[80];
//        for (int i = 0; i < 80; i++) {
//            testArr[i] = (int) (Math.random() * 800);
//        }
//        System.out.println("排序前时间：" + System.currentTimeMillis());
//        quickSort(testArr, 0, testArr.length - 1);
//        System.out.println("排序后时间：" + System.currentTimeMillis());
        int[] arr = {3, 1, 0, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int begin, int end) {

        if (begin < end) {
            int val = arr[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                // 右侧找比对比值小的
                while (i < j && val < arr[j]) {
                    j--;
                }
                // 右侧找到比对比值小的
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                // 左侧找比对比值大的
                while (i < j && arr[i] < val) {
                    i++;
                }
                // 左侧找到比对比值小的
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            // 此时 i 就是中间值索引
            arr[i] = val;
            quickSort(arr, begin, i - 1);
            quickSort(arr, i + 1, end);
        }
    }
}
