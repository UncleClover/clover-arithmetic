package com.clover.arithmetic.sort;

import java.util.Random;

import com.alibaba.fastjson.JSON;

public class Bubbling {
	public static void main(String[] args) {
		int length = 100000;
		int[] a = new int[length];
		for (int i = 0; i < length; i++) {
			a[i] = new Random().nextInt(1000);
		}
		asc(a);
	}
	
	private static int[] asc(int[] a) {
		long startTime = System.currentTimeMillis();
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				int nextVal = a[i + 1];
				if (a[i] > nextVal) {
					a[i + 1] = a[i];
					a[i] = nextVal;
				}
			}
		}
		System.out.printf("冒泡排序耗时：%dms\n", (System.currentTimeMillis() - startTime));
		return a;
	}
	
	private static int[] desc(int[] a) {
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				int nextVal = a[i + 1];
				if (a[i] < nextVal) {
					a[i + 1] = a[i];
					a[i] = nextVal;
				}
			}
		}
		return a;
	}
}
