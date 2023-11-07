//给你一个字符串 s，找到 s 中最长的回文子串。
//
// 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 字符串 动态规划 👍 6901 👎 0


package cn.weifeng.leetcode.editor.cn;

public class P5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new P5_LongestPalindromicSubstring().new Solution();
        System.out.println(solution.longestPalindrome("a"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
            int strLen = s.length();
            int left;
            int right;
            int len = 1;

            // 用来返回
            int maxLen = 0;
            int maxStart = 0;

            for (int i = 0; i < s.length(); i++) {
                left = i - 1;
                right = i + 1;
                while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                    len++;
                    left--;
                }
                while (right < strLen && s.charAt(right) == s.charAt(i)) {
                    len++;
                    right++;
                }
                while (left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)) {
                    len = len + 2;
                    left--;
                    right++;
                }
                if (len > maxLen) {
                    maxLen = len;
                    maxStart = left;
                }
                len = 1;
            }
            return s.substring(maxStart + 1, maxStart + maxLen + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}