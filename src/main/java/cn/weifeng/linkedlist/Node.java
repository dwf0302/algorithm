package cn.weifeng.linkedlist;

public class Node<T> {

    public T value;

    public Node<T> next;

    public Node<T> last;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

}
