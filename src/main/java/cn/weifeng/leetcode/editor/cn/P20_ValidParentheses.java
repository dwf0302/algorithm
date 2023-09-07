//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 每个右括号都有一个对应的相同类型的左括号。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
//
// Related Topics 栈 字符串 👍 4141 👎 0


package cn.weifeng.leetcode.editor.cn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class P20_ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new P20_ValidParentheses().new Solution();
        boolean valid = solution.isValid("(){}");
        System.out.printf(String.valueOf(valid));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final Map<Character,Character> map = new HashMap<Character,Character>(){{ put('{','}'); put('[',']'); put('(',')'); put('?','?'); }};
        public boolean isValid(String s) {
            if (s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
            LinkedList<Character> stack = new LinkedList<Character>() {{
                add('?');
            }};
            for (Character c : s.toCharArray()) {
                if (map.containsKey(c)) stack.addLast(c);
                else if (map.get(stack.removeLast()) != c) return false;
            }
            return stack.size() == 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}