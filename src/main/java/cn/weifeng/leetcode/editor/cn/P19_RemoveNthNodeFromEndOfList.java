//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// Related Topics 链表 双指针 👍 2724 👎 0


package cn.weifeng.leetcode.editor.cn;

public class P19_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new P19_RemoveNthNodeFromEndOfList().new Solution();
//        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2
        solution.removeNthFromEnd(new ListNode(1, new ListNode(2)), 2);
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (null == head || n == 0) {
                return head;
            }
            int length = this.getLength(head);
            if (n == length) {
                return head.next;
            }
            ListNode cur = head;
            ListNode last = cur;
            ListNode pre = cur;
            while (pre.next != null) {
                if(n == 0){
                    pre = pre.next;
                    last = last.next;
                    cur = last;
                }else {
                    n--;
                    pre = pre.next;
                }
            }
            cur.next = last.next.next;
            return head;
        }

        private int getLength(ListNode head) {
            if (null == head) {
                return 0;
            } else {
                return 1 + this.getLength(head.next);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}