package editor.cn.learning.sort;

/**
 * 选择排序
 *
 * @author DWF
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 3, 1, 4, 2, 8, 6};
        int[] testArr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            testArr[i] = (int) (Math.random() * 800000);
        }
        System.out.println("排序前时间：" + System.currentTimeMillis());
        sort(testArr);
//        System.out.println(Arrays.toString(arr));
        System.out.println("排序后时间：" + System.currentTimeMillis());
//        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }

}
