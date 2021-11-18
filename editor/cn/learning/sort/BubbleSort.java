package editor.cn.learning.sort;

/**
 * 冒泡排序
 *
 * @author DWF
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 3, 1, 4, 2, 8, 6};
        int[] testArr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            testArr[i] = (int)(Math.random() * 800000);
        }
        System.out.println("排序前时间："+System.currentTimeMillis());
        sort(testArr);
        System.out.println("排序后时间："+System.currentTimeMillis());
//        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int var = arr[j];
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = var;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }
}
