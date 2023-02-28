package cn.weifeng.sort;

/**
 * 堆排序
 */
public class HeapSort {

    public static void main(String[] args) throws Exception {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.push(2);
        maxHeap.push(1);
        maxHeap.push(3);
        maxHeap.push(4);
        maxHeap.push(1);
        maxHeap.push(5);
        maxHeap.push(9);
        maxHeap.push(11);
        maxHeap.push(18);

        // int[] arr = maxHeap.getArr();
        // System.out.println("arr");
        //
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());
        // System.out.println(maxHeap.pop());

        int[] arr = new int[]{2, 3, 1, 5, 6, 7, 2};
        sort(arr);
        System.out.println("");

    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }

    }


    public static class MaxHeap {
        // 堆容量限制
        public int limit;
        // 当前堆大小
        public int heapSize;
        // 堆
        private int[] heap;

        public void push(int num) throws Exception {
            if (heapSize == limit) {
                throw new Exception("Heap is full");
            }
            heap[heapSize] = num;
            heapInsert(heap, heapSize++);
        }

        public int pop() throws Exception {
            if (heapSize == 0) {
                throw new Exception("Heap is empty");
            }
            if (heapSize == 1) {
                return heap[--heapSize];
            }
            int v = heap[0];
            heap[0] = heap[--heapSize];
            heapify(heap, 0, heapSize);
            return v;
        }

        private static void heapify(int[] arr, int index, int heapSize) {
            int left = index * 2 + 1;
            while (left < heapSize) {
                int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
                largest = arr[index] > arr[largest] ? index : largest;
                if (largest == index) {
                    break;
                }
                swap(arr, largest, index);
                index = largest;
                left = index * 2 + 1;
            }
        }

        private static void heapInsert(int[] arr, int index) {
            while (arr[index] > arr[(index - 1) / 2]) {
                swap(arr, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }


        public MaxHeap(int limit) {
            this.limit = limit;
            heap = new int[limit];
        }

        public int[] getArr() {
            return heap;
        }
    }


    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[index] > arr[largest] ? index : largest;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int v = arr[i];
        arr[i] = arr[j];
        arr[j] = v;
    }
}
