package com.examplecn.algorithms;

/**
 * @author pengjieran
 * @date 2019-04-22
 * @desc 各种排序算法的模板方法
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

    private static void exchange(Comparable[] a, int i, int j) {

        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(Comparable[] a) {

        for (int i = 0; i <  a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
