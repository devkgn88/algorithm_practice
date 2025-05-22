package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 32384
 * 문제명: 사랑은 고려대입니다	
 * 문제 링크: https://www.acmicpc.net/problem/32384
 */
public class BOJ_32384 {
	public static void main(String[] args) {
		String str = "LoveisKoreaUniversity";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			if(i != 0) System.out.print(" ");
			System.out.print(str);
		}
		sc.close();
	}
}
