package com.examplecn.utils;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.util.RandomUtil;

public class DataUtils {

	public static Integer[] randomArrays(int size) {
		
		List<Integer> list = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			
			int randomInt = RandomUtil.randomInt(0, size * 10);
			list.add(randomInt);
		}
		
		Integer[] array = new Integer[size];
		
		return list.toArray(array);
	}
}
