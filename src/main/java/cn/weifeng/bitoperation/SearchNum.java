package cn.weifeng.bitoperation;

public class SearchNum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 11, 11, 11, 12, 12, 14, 14, 15, 15, 15};
        searchOne(arr);

        search1BitCount(1);
        search1BitCount(2);
        search1BitCount(3);
    }

    /**
     * 找出一个数组中 出现奇数次的两个数
     */
    public static void searchOne(int[] arr) {
        // 找出两个奇数对的异或结果
        int eor = 0;
        for (int k : arr) {
            eor ^= k;
        }
        System.out.println(11 ^ 15);
        // 获取不同的为 即提取一个1
        int diff = eor & ((~eor) + 1);

        int onlyOne = 0;
        for (int j : arr) {
            if ((j & diff) == 0) {
                onlyOne ^= j;
            }
        }
        System.out.println("一号数字：" + onlyOne + " 二号数字：" + (onlyOne ^ eor));

    }

    /**
     * 查找数字中  二进制为1的个数
     *
     * @param num
     * @return
     */
    public static int search1BitCount(int num) {
        int count = 0;
        while (num != 0) {
            int rightNum = num & ((~num) + 1);
            count++;
            num ^= rightNum;
        }

        System.out.println(count);
        return count;
    }

}
