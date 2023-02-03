package cn.weifeng.binary;

/**
 * 二分-查找左侧最小值-位置
 */
public class LeftMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 6};
        int searchLeftMin = searchLeftMin(arr, 5);
        System.out.println(searchLeftMin);
    }

    public static int searchLeftMin(int[] arr, int value) {
        int index = -1;
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mod = L + ((R - L) >> 1);
            if (arr[mod] >= value) {
                index = mod;
                R = mod - 1;
            } else {
                L = mod + 1;
            }
        }
        return index;
    }
}
