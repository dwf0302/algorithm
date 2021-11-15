package editor.cn.learning.stack;

/**
 * @author DWF
 */
public class LinkedStackDemo {
    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);
        linkedStack.push(5);
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
    }
}

class LinkedStack<T> {

    private LinkedList<T> head = new LinkedList("");

    public void push(T t) {
        LinkedList cur = new LinkedList(t);
        if (head.next != null) {
            cur.next = head.next;
        }
        head.next = cur;
    }

    public T pop() {
        if (head.next != null) {
            LinkedList temp = head.next;
            head.next = head.next.next;
            return (T) temp.no;
        }
        return null;
    }

}

class LinkedList<T> {

    public T no;

    public LinkedList next;

    public LinkedList(T no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "no=" + no +
                '}';
    }
}