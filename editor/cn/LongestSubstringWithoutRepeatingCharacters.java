//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 👍 6135 👎 0

package editor.cn;

import java.util.LinkedList;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        String str = "pwwkew";
        int i = solution.lengthOfLongestSubstring(str);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s == null || "".equals(s)){
                return 0;
            }
            LinkedList<Character> charList = new LinkedList<>();
//            char[] chars = s.toCharArray();
//            int res = 0;
//            for (int i = 0; i < chars.length; i++) {
//                charList.add(chars[i]);
//                long count = charList.stream().distinct().count();
//                if (count < charList.size()) {
//                    charList.removeFirst();
//                }
//            }
//            for (int i = 0; i < s.length(); i++) {
//                int cs = s.charAt(i);
//                char c = s.charAt(i);
//                if(charList.contains(c)){
//                    charList.removeFirst();
//                }
//                charList.add(c);
//            }
//            return charList.size();

            int[] last = new int[128];
            for(int i = 0; i < 128; i++) {
                last[i] = -1;
            }
            int n = s.length();

            int res = 0;
            int start = 0; // 窗口开始位置
            for(int i = 0; i < n; i++) {
                int index = s.charAt(i);
                start = Math.max(start, last[index] + 1);
                res   = Math.max(res, i - start + 1);
                last[index] = i;
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}