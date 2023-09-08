//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：3
//解释：有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 45 
// 
//
// Related Topics 记忆化搜索 数学 动态规划 👍 3225 👎 0


package cn.weifeng.leetcode.editor.cn;

public class P70_ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new P70_ClimbingStairs().new Solution();
        System.out.println(solution.climbStairs(10));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 动态规划
        public int climbStairs(int n) {
            if (n < 1) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            int tem = 0;
            int a = 1;
            int b = 2;
            for (int i = 3; i <= n; i++) {
                tem = a + b;
                a = b;
                b = tem;
            }
            return tem;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}