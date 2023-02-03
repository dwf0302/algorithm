package cn.weifeng.linkedlist;

public class TestLinkedList {

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

        Node node1 = new Node();
        node1.setValue(1);

        Node node2 = new Node();
        node2.setValue(2);

        Node node3 = new Node();
        node3.setValue(3);

        Node node4 = new Node();
        node4.setValue(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }

    static class DoubleNode {
        private int value;
        private DoubleNode next;
        private DoubleNode last;

        public DoubleNode() {
        }

        public DoubleNode(int value, DoubleNode next, DoubleNode last) {
            this.value = value;
            this.next = next;
            this.last = last;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public DoubleNode getNext() {
            return next;
        }

        public void setNext(DoubleNode next) {
            this.next = next;
        }

        public DoubleNode getLast() {
            return last;
        }

        public void setLast(DoubleNode last) {
            this.last = last;
        }

        public DoubleNode next() {
            return next;
        }
    }


    static class Node {
        private int value;
        private Node next;

        public Node() {
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNode() {
            return next;
        }

        public void setNode(Node next) {
            this.next = next;
        }

        public Node next() {
            return next;
        }
    }
}
