package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2753
 * 문제명: 윤년
 * 문제 링크: https://www.acmicpc.net/problem/2753
 */
public class BOJ_2753 {
	public static void main(String[] args) {
		// 윤년
		// 연도가 4의 배수이면서, 100의 배수가 아닐 때 
		// 또는 400의 배수 일 때
		Scanner sc = new Scanner(System.in);
		long year = sc.nextLong();
		boolean result = false;
		if(year%4 == 0 && year%100 != 0) result = true;
		if(year%400 == 0) result = true;		
		System.out.println(result?1:0);
		sc.close();
	}
}
