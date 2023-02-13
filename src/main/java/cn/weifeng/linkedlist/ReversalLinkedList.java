package cn.weifeng.linkedlist;

public class ReversalLinkedList {

    public static void main(String[] args) {
        Node head = buildNode();

        // Node node = reversalLinkedList(head);
        // System.out.println(node);

        Node node = remValue(head, 1);
        System.out.println(node);
    }

    /**
     * 反转单链表
     *
     * @param head
     * @return
     */
    public static Node reversalLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;

            head.next = pre;

            pre = head;

            head = next;
        }
        return pre;
    }

    /**
     * 法装双链表
     *
     * @param head
     * @return
     */
    public static DoubleNode reversalDoubleLinkedList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;

            head.next = pre;
            head.last = next;

            pre = head;

            head = next;
        }
        return pre;
    }

    public static Node remValue(Node head, int v) {
        // 先定位删除后的头部
        while (head != null) {
            if (head.value != v) {
                break;
            }
            head = head.next;
        }

        // 删除链表内包好的V
        Node pre = head;
        Node cur = head;
        while (cur != null) {
            if (cur.value == v) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    private static Node buildNode() {

        Node node1 = new Node(1);

        Node node2 = new Node(2);

        Node node3 = new Node(3);

        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }

    static class DoubleNode {
        public int value;
        public DoubleNode next;
        public DoubleNode last;

        public DoubleNode() {
        }

        public DoubleNode(int value) {
            this.value = value;
        }

        public DoubleNode(int value, DoubleNode next, DoubleNode last) {
            this.value = value;
            this.next = next;
            this.last = last;
        }
    }

    static class Node {
        public int value;
        public Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
