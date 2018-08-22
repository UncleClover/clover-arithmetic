package com.clover.arithmetic.sort;

import java.util.Random;

import com.alibaba.fastjson.JSON;

public class Selection {
	public static void main(String[] args) {
		int length = 100000;
		int[] a = new int[length];
		for (int i = 0; i < length; i++) {
			a[i] = new Random().nextInt(1000);
		}
//		System.out.println(JSON.toJSON(a));
//		System.out.println(JSON.toJSON(asc(a)));
		asc(a);
	}

	private static int[] asc(int[] a) {
		long startTime = System.currentTimeMillis();
		int minIndex;
		for (int i = 0; i < a.length; i++) {
			minIndex = i;
			for (int j = i; j < a.length - 1; j++) {
				if (a[j + 1] < a[minIndex]) {
					minIndex = j + 1;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		System.out.printf("选择排序耗时：%dms\n", (System.currentTimeMillis() - startTime));
		return a;
	}

}
