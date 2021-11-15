package editor.cn.learning.linkedlist;

/**
 * 单链表
 *
 * @author DWF
 */
public class SingleLinkedList {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.addByOrder(new HeroNode(1, "1"));
        linkedList.addByOrder(new HeroNode(2, "2"));
        linkedList.addByOrder(new HeroNode(3, "3"));
        linkedList.addByOrder(new HeroNode(4, "4"));
//        linkedList.addByOrder(new HeroNode(1, "1111"));
//        linkedList.print();
//        linkedList.del(1);
        HeroNode heroNode = linkedList.flip(linkedList.head);
        linkedList.print();
    }

    HeroNode head = new HeroNode(0, "");

    public HeroNode flip(HeroNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        HeroNode pre = null;
        // 获取第一个有效node
        HeroNode cur = head.next;
        // 临时数据
        HeroNode temp;
        while (cur != null) {
            // 暂存下一个临时
            temp = cur.next;
            // 当前值的next指针重新指向pre
            cur.next = pre;
            // 移动pre的指针使其指向当前值
            pre = cur;
            cur = temp;
        }
        return pre;
    }


    public HeroNode getHeroNode(HeroNode oldNode) {
        HeroNode head = oldNode;
        HeroNode mid = oldNode.next;
        if (mid == null) {
            System.out.println("空链表");
            return null;
        }
        while (true) {
            if (mid.next == null) {
                head.next = null;
                return mid;
            }
            head = head.next;
            mid = mid.next;
        }
    }

    public void add(HeroNode node) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addByOrder(HeroNode node) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no) {
                break;
            }
            if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("编号已存在，不能插入");
        } else {
            node.next = temp.next;
            temp.next = node;
        }

    }

    public void del(int no) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                System.out.println("没有找到");
                break;
            }
            if (temp.next.no == no) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public void print() {
        HeroNode temp = head;
        while (true) {
            HeroNode next = temp.next;
            if (next == null) {
                break;
            }
            System.out.println(next);
            temp = next;
        }
    }
}


class HeroNode {

    public int no;

    public String name;

    public HeroNode next;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

}
