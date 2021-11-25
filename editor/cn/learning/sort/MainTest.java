package editor.cn.learning.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author DWF
 */
public class MainTest {

    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 2, 9, 8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

        List<String> strList = new ArrayList<>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
//        strList.add("4");
        List<String> strList2 = new ArrayList<>();
        strList2.add("4");
        strList2.add("6");
        strList2.add("7");
        boolean contains = Collections.disjoint(strList, strList2);
        System.out.println(contains);
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int var = arr[j];
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = var;
                }
            }
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            int minVal = arr[i];
            for (int j = i +1 ; j < arr.length; j++) {
                if(arr[j] < minVal){
                    minVal = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = minVal;
            }
        }
    }


}
