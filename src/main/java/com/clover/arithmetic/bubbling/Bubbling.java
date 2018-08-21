package com.clover.arithmetic.bubbling;

import java.util.Random;

import com.alibaba.fastjson.JSON;

public class Bubbling {
	public static void main(String[] args) {
		int[] a = new int[100];
		for (int i = 0; i < 100; i++) {
			a[i] = new Random().nextInt(1000);
		}
		System.out.println(JSON.toJSONString(a));

		System.out.println(JSON.toJSONString(asc(a)));
		System.out.println(JSON.toJSONString(desc(a)));
	}
	
	private static int[] asc(int[] a) {
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				int nextVal = a[i + 1];
				if (a[i] > nextVal) {
					a[i + 1] = a[i];
					a[i] = nextVal;
				}
			}
		}
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
