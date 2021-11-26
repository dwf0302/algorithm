package editor.cn.learning.sort;

/**
 * 希尔排序
 *
 * @author DWF
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 9, 1};
        int[] testArr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            testArr[i] = (int) (Math.random() * 800000);
        }
        System.out.println("排序前时间：" + System.currentTimeMillis());
        shellSort(testArr);
        System.out.println("排序后时间：" + System.currentTimeMillis());
    }

    public static void shellSort(int[] arr) {
        // 确定步长
        int temp;
        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }
}
