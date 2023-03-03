package cn.weifeng.sort;

import java.util.Comparator;

public class CompareSort implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
