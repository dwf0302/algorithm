package editor.cn.learning.queue;

import java.util.Scanner;

/**
 * 环形数组队列
 *
 * @author DWF
 */
class CircularArrayMainTest {
    public static void main(String[] args) {
        CircularArrayQueue arrayQueue = new CircularArrayQueue(3);
        Scanner sc = new Scanner(System.in);
        // 用户输入
        char key = ' ';
        boolean flag = true;
        // 显示菜单
        while (flag) {
            System.out.println("s:显示队列");
            System.out.println("a:添加数据");
            System.out.println("g:获取数据");
            System.out.println("h:显示队头");
            System.out.println("e:退出程序");
            key = sc.next().charAt(0);
            switch (key) {
                case 's':
                    try {
                        arrayQueue.show();
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

class CircularArrayQueue {
    private int front;
    private int rear;
    private int maxSize;
    private int[] arrayQueue;

    public CircularArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arrayQueue = new int[maxSize];
        this.front = 0;
        this.rear = 0;
    }

    /**
     * 判断环形数组是否已满
     *
     * @return
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 判断环形数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 向环形队列添加值
     */
    public void addQueue(int val) {
        if (isFull()) {
            System.out.println("环形队列已满");
            return;
        }
        if (rear > maxSize - 1) {
            rear = rear % maxSize;
        }
        arrayQueue[rear++] = val;
    }

    /**
     * 从环形队列取值
     */
    public int outQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        if (front > maxSize-1) {
            front = front % maxSize;
        }
        return arrayQueue[front++];
    }

    /**
     * 展示数组有效值
     */
    public void show() {
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int index = (rear + maxSize - front) % maxSize;
        for (int i = front; i < front + index; i++) {
            System.out.println("arr[" + i % maxSize + "]=" + arrayQueue[i % maxSize]);
        }
    }
}

