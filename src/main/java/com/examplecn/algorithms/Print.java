package com.examplecn.algorithms;

public class Print {

    public static String pringArray(Integer[] array) {
        
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("{");
        for (int i : array) {
            
            strBuilder.append(i);
            if (i != array[array.length - 1]) {
                
                strBuilder.append(", ");
            }
        }
        strBuilder.append("}");
        
        return strBuilder.toString();
    }
}