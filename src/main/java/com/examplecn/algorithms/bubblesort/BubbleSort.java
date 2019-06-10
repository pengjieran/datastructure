package com.examplecn.algorithms.bubblesort;

import com.examplecn.algorithms.Print;

/**
 * 冒泡排序相关算法实现
 * @author Aaron
 * @Date   2019年6月10日 下午3:46:06
 * @Desc
 */
public class BubbleSort<T> {

    /**
     * 没有经过任何优化的冒泡排序
     * @param array
     */
    public static void sortCommon(Integer[] array) {
        
        if (null != array && array.length > 0) {
            
            int length = array.length;
            for (int i = 0; i < length - 1; i++) {
                
                for (int j = 0; j < length - i - 1; j++) {
                    
                    System.out.println("第" + j  + "次比较");
                    if (array[j] > array[j + 1]) {
                        
                        System.out.println("交换两值：" + array[j] + "和" + array[j + 1]);
                        Integer temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    } else {
                        
                        System.out.println("不交换两值");
                    }
                }
                System.out.println("第" + (i + 1) + "趟比较后：" + Print.pringArray(array));
            }
        }
    }
    
    public static void main(String[] args) {
        
        Integer[] array = {4, 10, 5, 7, 2, 9, 3, 6};
        sortCommon(array);
        Print.pringArray(array);
    }
}