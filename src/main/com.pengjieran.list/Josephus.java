package com.pengjieran.list;

/**
 * 约瑟夫环问题:
 * 创建一个具有n个元素的顺序表对象，从第s个元素开始，依次计数，每次数到d，就将对应元素删除，直到剩下一个元素
 * Created by Aaron on 2016/5/14.
 */
public class Josephus {

    /**
     * 创建约瑟夫环
     * @param number 环长度
     * @param start 起始位置
     * @param distance 计数
     */
    public Josephus(int number, int start, int distance) {

        SeqList<String> list = new SeqList<String>(number);

        //添加字符串对象
        for (int i = 0; i < number; i++) {

            list.append((char)('A' + i) + "");
        }

        System.out.println("约瑟夫环:" + list.toString());

        int i = start;
        //多于一个对象时循环
        while (list.length() > 1) {

            //计数器按循环规律变化，顺序表可以看做是环形结构
            i = (i + distance - 1) % list.length();
            System.out.println("处决犯人:" + list.remove(i).toString());
        }

        System.out.println(list.get(0).toString() + "被赦免");
    }

    public static void main(String[] args) {

        new Josephus(5, 0, 2);
    }
}
