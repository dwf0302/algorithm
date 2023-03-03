package cn.weifeng.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * 可变更堆
 */
public class UpdateHeap<T> {
    // 堆
    private ArrayList<T> heap;
    // 堆索引
    private HashMap<T, Integer> indexMap;
    // 堆大小
    private Integer heapSize;
    // 比较器
    private Comparator<? extends T> comp;

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public int size() {
        return heapSize;
    }

    public boolean contains(T obj) {
        return indexMap.containsKey(obj);
    }

    public T peek() {
        return heap.get(0);
    }

    public void push(T obj) {
        heap.add(obj);
        indexMap.put(obj, heapSize);
        heapInsert(heapSize++);
    }

    private void heapInsert(Integer heapSize) {

    }
}
