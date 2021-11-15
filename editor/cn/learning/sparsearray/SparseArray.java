package editor.cn.learning.sparsearray;

/**
 * 稀疏数组 实现五子棋功能
 *
 * @author DWF
 */
public class SparseArray {

    public static void main(String[] args) {
        int charArr[][] = new int[11][11];
        charArr[1][2] = 1;
        charArr[2][3] = 2;
        for (int[] row : charArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        int sparseRow = 0;

        for (int[] row : charArr) {
            for (int data : row) {
                if (data != 0) {
                    sparseRow++;
                }
            }
        }
        System.out.println(sparseRow);
        int sparseArray[][] = new int[sparseRow + 1][3];

        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sparseRow;

        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                if (charArr[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = charArr[i][j];
                }
            }
        }

        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                System.out.printf("%d\t", sparseArray[i][j]);
            }
            System.out.println();
        }


    }
}
