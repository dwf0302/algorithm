package editor.cn.learning.linkedlist;

public class CircleLinkedListDemo {

    public static void main(String[] args) {
        CircleLinkedList circle = new CircleLinkedList();
        circle.out(2, 2, 4);
//        System.out.println(circle.first.next);
    }
}

class CircleLinkedList {

    public LinkedList first;
    public LinkedList last;
    public int size;


    public void add(int n) {
        if (n == 0) {
            System.out.println("必须大于0");
            return;
        }
        for (int i = 1; i <= n; i++) {
            LinkedList linkedList = new LinkedList(i, i + "");
            if (i == 1) {
                first = linkedList;
                first.next = first;
                last = first;
            } else {
                last.next = linkedList;
                linkedList.next = first;
                last = linkedList;
            }
        }
        size = n;
    }

    /**
     * @param n   从第几个开始出队
     * @param m   每次相隔多少人
     * @param nums 人数
     */
    public void out(int n, int m, int nums) {
        add(nums);
        if(first==null || n <1 || n > nums){
            System.out.println("参数有误");
        }
        // 定位
        for (int i = 0; i < n - 1; i++) {
            first = first.next;
            last = last.next;
        }
        while (true) {
            if (last == first) {
                break;
            }
            for (int i = 0; i < m - 1; i++) {
                first = first.next;
                last = last.next;
            }
            System.out.println("出圈：" + first.no);

            first = first.next;
            last.next = first;
        }
        System.out.println("最后出圈：" + first.no);
    }
}
