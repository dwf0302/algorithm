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
// Related Topics 链表 双指针 👍 1651 👎 0
 
package editor.cn;
public class RemoveNthNodeFromEndOfList{
  public static void main(String[] args) {
      Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
//      ListNode head = new ListNode();
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
//      head.next.next = new ListNode(3);
//      head.next.next.next = new ListNode(4);
//      head.next.next.next.next = new ListNode(5);
      solution.removeNthFromEnd(head, 1);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 *
 *
 *
 *
 *
 *
 *
 */
public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head ==null || head.next == null) {
            return null;
        }
        /** 第一种两次遍历解法
         *  int totalLength = 0;
         *         ListNode cur = head;
         *         while (cur != null){
         *             totalLength++;
         *             cur = cur.next;
         *         }
         *         // 待删除
         *         int del = totalLength - n;
         *
         *
         *         ListNode temp = new ListNode(0);
         *         temp.next = head;
         *
         *         cur = temp;
         *         while (del > 0){
         *             del--;
         *             cur = cur.next;
         *         }
         *         cur.next = cur.next.next;
         *         return temp.next;
         */
         // 第二种解法
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode first = temp;
        ListNode second = temp;

        for (int i = 0; i < n + 1; i++) {
            first = first.next;
        }

        while (first != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return temp.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}