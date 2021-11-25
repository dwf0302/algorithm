package editor.cn.learning.sort;

/**
 * 插入排序
 *
 * @author DWF
 */
public class InsertSort {

    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 9, 1};
        int[] testArr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            testArr[i] = (int) (Math.random() * 800000);
        }
        System.out.println("排序前时间：" + System.currentTimeMillis());
        sort(testArr);
        System.out.println("排序后时间：" + System.currentTimeMillis());
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int insertVal = arr[i + 1];
            int insertIndex = i;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
        }
    }
}
