package editor.cn.learning.queue;

import java.util.Scanner;

/**
 * 数组队列
 *
 * @author DWF
 */


class MainTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(4);
        Scanner sc = new Scanner(System.in);
        // 用户输入
        char key = ' ';
        boolean flag = true;
        // 显示菜单
        while(flag){
            System.out.println("s:显示队列");
            System.out.println("a:添加数据");
            System.out.println("g:获取数据");
            System.out.println("h:显示队头");
            System.out.println("e:退出程序");
            key = sc.next().charAt(0);
            switch (key) {
                case 's':
                    try {
                        arrayQueue.showQueue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'a':
                    try {
                        System.out.println("输入一个数");
                        int num = sc.nextInt();
                        arrayQueue.addQueue(num);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try {
                        System.out.println("取出的数据是：" + arrayQueue.outQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    sc.close();
                    flag = false;
                default:
                    break;
            }
        }
    }
}

class ArrayQueue {

    private int front;
    private int rear;
    private int maxSize;
    private int[] arrayQueue;

    public ArrayQueue(int maxSize) {
        arrayQueue = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    /**
     * 判断队列是否已满
     *
     * @return
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否已空
     *
     * @return
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 入队
     *
     * @param val
     */
    public void addQueue(int val) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        arrayQueue[++rear] = val;
    }

    /**
     * 出队
     */
    public int outQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列已空");
        }
        return arrayQueue[++front];
    }

    /**
     * 展示当前队列
     *
     * @return
     */
    public void showQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列已空");
        }
        for (int i = 0; i < arrayQueue.length; i++) {
            System.out.printf("索引位置=%d , 值=%d", i, arrayQueue[i]);
        }
    }

}


