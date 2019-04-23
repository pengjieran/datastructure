package com.examplecn.algorithms;

/**
 * @author pengjieran
 * @date 2019-04-22
 * @desc 各种排序算法的模板方法，其它排序方法都会在sort中实现
 */
public class Example {

    public static void sort(Comparable[] a) {

        //排序的核心实现
    }

    /**
     * 检查v是否小于w,该方法与v<w结果一致
     * @param v
     * @param w
     * @return
     */
    private static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) < 0;
    }

    /**
     * 交换两个位置的数据
     * @param a
     * @param i
     * @param j
     */
    private static void exchange(Comparable[] a, int i, int j) {

        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 打印数组中的数据
     * @param a
     */
    private static void print(Comparable[] a) {

        for (int i = 0; i <  a.length; i++) {

            System.out.println(a[i]);
        }
    }

    /**
     * 检查是不是已排好序的
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a) {

        for (int i = 1; i < a.length; i++) {

            if (less(a[i], a[i - 1])) return false;
        }

        return true;
    }
}
