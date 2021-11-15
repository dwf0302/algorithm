package editor.cn.learning;

import java.util.Arrays;

/**
 * @author DWF
 */
public class SelectSort {

    public static void main(String[] args) {
        // 冒泡排序 时间复杂度 O(n²)
        int[] intArray = new int[]{2, 1, 4, 7, 3, 6, 513, 23};
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int n = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = n;
                }
            }
        }


        // 选择排序
        for (int i = 0; i < intArray.length-1; i++) {
            int max = i;
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[max] > intArray[j]) {
                    max = j;
                }
            }
            int maxValue = intArray[max];
            intArray[max] = intArray[i];
            intArray[i] = maxValue;

        }
        System.out.println(Arrays.toString(intArray));
    }
}
