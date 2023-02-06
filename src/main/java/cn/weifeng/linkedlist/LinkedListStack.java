package cn.weifeng.linkedlist;

/**
 * 链表模拟栈
 */
public class LinkedListStack {
    private static Node<Integer> head;
    private static Node<Integer> tail;

    public static void main(String[] args) throws Exception {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }


    public static void push(Integer v) {
        Node<Integer> cur = new Node<>(v);
        if (head == null) {
            head = cur;
            tail = cur;
        } else {
            cur.next = head;
            head.last = cur;
            head = cur;
        }
    }


    public static Integer pop() throws Exception {
        if (head == null) {
            throw new Exception("栈空");
        }
        Node<Integer> cur = head;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            cur.next = null;
            cur.last = null;
        }
        return cur.value;
    }
}
