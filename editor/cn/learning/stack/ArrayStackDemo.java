package editor.cn.learning.stack;

/**
 * @author DWF
 */
public class ArrayStackDemo {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("---------------剩余数据------------");
        arrayStack.show();
    }
}

class ArrayStack {

    private int[] arr;

    private int lastIndex;

    private int size;

    public ArrayStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.lastIndex = -1;
    }

    public void push(int data) {
        if (lastIndex == size - 1) {
            System.out.println("数据已满");
            return;
        }
        lastIndex++;
        arr[lastIndex] = data;
    }

    public int pop() {
        if (lastIndex == -1) {
            throw new RuntimeException("数据为空");
        }
        int temp = arr[lastIndex];
        lastIndex--;
        return temp;
    }

    public void show() {
        if (lastIndex == -1) {
            throw new RuntimeException("数据为空");
        }
        for (int i = lastIndex; i > -1; i--) {
            System.out.println("数据为:" + arr[i]);
        }
    }
}