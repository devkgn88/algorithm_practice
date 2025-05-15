package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2438
 * 문제명: 별 찍기 -1
 * 문제 링크: https://www.acmicpc.net/problem/2438
 */
public class BOJ_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
