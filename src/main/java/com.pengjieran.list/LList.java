package com.pengjieran.list;

/**
 * 线性列表基础接口
 * Created by Aaron on 2016/5/10.
 */
public interface LList<T> {

    //当前链表是否为空
    boolean isEmpty();

    //返回链表长度
    int length();

    //发挥第i号元素
    T get(int i);

    //设置第i号元素为t
    void set(int i, T t);

    //插入t作为第i号元素
    void insert(int i, T t);

    //在线性表最后插入元素t
    void append(T t);

    //删除第i号元素
    T remove(int i);

    //删除所有元素
    void removeAll();

    //查找
    T search(T key);

    //是否包含指定元素
    boolean contain(T key);
}
