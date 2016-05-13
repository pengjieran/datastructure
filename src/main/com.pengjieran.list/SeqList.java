package com.pengjieran.list;

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

    }

    public void insert(int i, T t) {

    }

    public void append(T t) {

    }

    public T remove(int i) {
        return null;
    }

    public void removeAll() {
        this.len = 0;
    }

    public T search(T key) {
        return null;
    }
}
