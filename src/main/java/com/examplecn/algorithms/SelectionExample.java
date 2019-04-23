package com.examplecn.algorithms;

/**
 * 选择排序
 * 两层循环遍历，
 * 外层循环：确定被比较的元素
 * 内层循环：确定与外层循环的元素的大小，当前元素大于内层循环元素，就交换位置
 */
public class SelectionExample extends Example {

    /**
     * 升序排列
     * @param a
     */
    @Override
    public void sort(Comparable[] a) {

        int length = a.length;
        for (int i = 0; i < length; i++) {

            int min = i;
            for (int j = i + 1; j < length; j++) {

                if (less(a[j], a[min])) min = j;
                exchange(a, i, min);
            }
        }
    }

    /*public static void main(String[] args) {

        String[] a = new String[]{"d", "c", "e", "b"};
        SelectionExample selectionExample = new SelectionExample();
        selectionExample.sort(a);
        System.out.println(selectionExample.isSorted(a));
        selectionExample.print(a);
    }*/
}
