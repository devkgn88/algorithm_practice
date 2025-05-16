package com.gn.baekjoon.bronze.lv3;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10872
 * 문제명: 팩토리얼
 * 문제 링크: https://www.acmicpc.net/problem/10872
 */
public class BOJ_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long result = 1;
		for(int i = 1 ; i <= num ; i++) {
			result *= i;
		}
		System.out.println(result);
		sc.close();
	}
}
