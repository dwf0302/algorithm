package editor.cn.learning.sort;

import java.util.Arrays;

/**
 * @author DWF
 */
public class MainTest {

    public static void main(String[] args) {
        int[] bubbleData = {1, 7, 6, 2, 9, 8};
        bubbleSort(bubbleData);
        System.out.println(Arrays.toString(bubbleData));
        int[] selectData = {1, 7, 6, 2, 9, 8};
        selectSort(selectData);
        System.out.println(Arrays.toString(selectData));

        int[] insertData = {1, 7, 6, 2, 9, 8};
        insertSort(insertData);
        System.out.println(Arrays.toString(insertData));

        int[] shellData = {1, 7, 6, 2, 9, 8};
        shellSort(shellData);
        System.out.println(Arrays.toString(shellData));
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                temp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        int minVal;
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minVal = arr[i];
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (minVal > arr[j]) {
                    minVal = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = minVal;
            }
        }
    }

    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && val < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }


    public static void shellSort(int[] arr) {

        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                int val = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > val) {
                    arr[j+step] = arr[j];
                    j = j -step;
                }
                arr[j+step] = val;
            }
        }

    }

}
