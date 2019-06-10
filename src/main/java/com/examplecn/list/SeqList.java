package com.examplecn.list;

import java.util.Arrays;

/**
 * 顺序表操作类
 * @author Aaron
 * Created by Aaron on 2016/5/10.
 */
public class SeqList<T> implements LList<T> {

    private Object[] element;

    private int len;

    public SeqList() {
        this(64);
    }

    public SeqList(int size) {

        //默认长度为64，长度不够时自动扩充为原来的2倍，大小小于0时，直接抛出异常
        if (size < 0) {

            this.element = new Object[64];
        } else {

            this.element = new Object[size];
        }
        this.len = 0;
    }

    public boolean isEmpty() {
        return 0 == this.len;
    }

    public int length() {
        return this.len;
    }

    /**
     * 长度刚好时返回指定的数据，否则返回null；
     * @param i
     * @return
     */
    public T get(int i) {

        if (i >= 0 && i < this.len) {

            return (T) this.element[i];
        }

        return null;
    }

    public void set(int i, T t) {

        if (null == t) return;
        if (i >= 0 && i < len) {

            this.element[i] = t;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * 插入元素，不允许为null值
     * @param i
     * @param t
     */
    public void insert(int i, T t) {

        if (null == t) return;
        //数组满了，则扩充数组长度
        if (this.len == element.length) {

            Object[] temp = this.element;
            this.element = new Object[temp.length * 2];
            //复制元素O(n)
            for (int j = 0; j < temp.length; j++) {

                this.element[j] = temp[j];
            }
        }

        if (i < 0) i = 0;

        if (i > this.len) i = this.len;

        //元素向后移动一位，平均移动n/2
        for (int j = this.len - 1; j >= i; j--) {

            this.element[j+1] = this.element[j];
        }

        this.element[i] = t;
        this.len++;
    }

    //最后一位追加元素
    public void append(T t) {
        insert(this.len, t);
    }

    public T remove(int i) {

        if (this.len == 0 || i < 0 || i >= this.len) return null;

        T old = (T) this.element[i];

        //元素前移一位
        for (int j = i; j < this.len-1; j++) {

            this.element[j] = this.element[j+1];
        }

        this.element[this.len-1] = null;
        this.len--;
        return old;
    }

    public void removeAll() {
        this.len = 0;
    }

    public T search(T key) {

        int findIndex = this.indexOf(key);
        return findIndex == -1 ? null : (T) this.element[findIndex];
    }

    @Override
    public boolean contain(T key) {
        return this.indexOf(key) >= 0;
    }

    //返回指定元素的索引
    public int indexOf(T key) {

        if (null != key) {

            for (int i = 0; i < this.len; i++) {

                if (this.element[i].equals(key)) return i;
            }
        }

        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeqList<?> seqList = (SeqList<?>) o;

        if (len != seqList.len) return false;
        return Arrays.equals(element, seqList.element);

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(element);
        result = 31 * result + len;
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(element);
    }
}
