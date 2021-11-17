//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 👍 6777 👎 0

package editor.cn;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l111 = new ListNode(3);
        l11.next = l111;
        l1.next = l11;

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l222 = new ListNode(4);
        l22.next = l222;
        l2.next = l22;
        Solution solution = new AddTwoNumbers().new Solution();
        solution.addTwoNumbers(l1, l2);
        System.out.println(11 / 10);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode();
            ListNode cur = res;
            // 进位
            int carry = 0;

            while (l1 != null || l2 != null) {
                int var1 = l1 != null ? l1.val : 0;
                int var2 = l2 != null ? l2.val : 0;
                // 相加的值
                int sum = var1 + var2 + carry;
                // 下次待进位
                carry = sum / 10;
                // 真正的值
                sum %= 10;

                cur.next = new ListNode(sum);
                cur = cur.next;

                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if(carry == 1){
                cur.next = new ListNode(1);
            }
            return res.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}