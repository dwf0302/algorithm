package editor.cn.learning.recursion;

/**
 * 迷宫回溯问题
 *
 * @author DWF
 */
public class Maze {

    public static void main(String[] args) {

        // 构建一个八行七列的二维数组用来描述迷宫
        int[][] arr = new int[8][7];

        // 初始化屏障
        for (int i = 0; i < 8; i++) {
            arr[i][0] = 1;
            arr[i][6] = 1;
        }

        for (int i = 0; i < 7; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
        }

        // 设置特殊的墙
        arr[3][1] = 1;
        arr[3][2] = 1;
        // 打印此时的二维数组
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf(" %d ", arr[i][j]);
            }
            System.out.println();
        }
        // 递归回溯 找路
        System.out.println("----------------------------------------");
        setWay(arr, 1, 1);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf(" %d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean setWay(int[][] arr, int i, int j) {
        // 0.代表此路尚未探索 1.代表墙  2.代表此路通  3.代表此路不通

        // 终点
        if (arr[6][5] == 2) {
            return true;
        }

        // 探路方向 下 右 上 左
        if (arr[i][j] == 0) {
            // 先假设此路是通的
            arr[i][j] = 2;

            // 继续向下探路
            if (setWay(arr, i + 1, j)) {
                return true;
            }
            // 下路不通 向左探路
            else if (setWay(arr, i, j + 1)) {
                return true;
            }

            // 左路不通 向上探路
            else if (setWay(arr, i - 1, j)) {
                return true;
            }

            // 上路不通 向有探路
            else if (setWay(arr, i, j - 1)) {
                return true;
            }

            // 死路
            else {
                arr[i][j] = 3;
                return false;
            }

        }  else {
            return false;
        }

    }
}
