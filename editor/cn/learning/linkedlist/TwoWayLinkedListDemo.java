package editor.cn.learning.linkedlist;

/**
 * 双向链表
 *
 * @author DWF
 */
public class TwoWayLinkedListDemo {

    public static void main(String[] args) {
        TwoWayLinkedList linkedList = new TwoWayLinkedList();
        linkedList.addEnd(new LinkedList(1, "111"));
        linkedList.addEnd(new LinkedList(2, "222"));
        linkedList.addEnd(new LinkedList(3, "333"));
        linkedList.addEnd(new LinkedList(4, "444"));
        linkedList.addEnd(new LinkedList(5, "555"));
        linkedList.addEnd(new LinkedList(6, "666"));
        linkedList.list();
        System.out.println("----------------删除-----------------");
        linkedList.del(1);
        System.out.println("--------------删除后数据--------------");
        linkedList.list();
    }


}

class TwoWayLinkedList {

    private LinkedList head = new LinkedList(-1, "");

    public void addEnd(LinkedList linkedList) {
        LinkedList temp = head;
        // 添加到双向链表
        while (true) {
            if (temp.next == null) {
                temp.next = linkedList;
                linkedList.pre = temp;
                break;
            }
            temp = temp.next;
        }
    }

    public void list() {
        LinkedList temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void del(int no) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        LinkedList temp = head;
        boolean flag = false;
        while (temp != null) {
            if (temp.no == no) {
                flag = true;
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("已删除");
        } else {
            System.out.println("未找到");
        }
    }

}

class LinkedList {

    public int no;

    public String name;

    public LinkedList next;

    public LinkedList pre;

    public LinkedList(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}