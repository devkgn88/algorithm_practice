package com.gn.baekjoon.bronze.lv4;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 2439
 * 문제명: 별찍기 -2
 * 문제 링크: https://www.acmicpc.net/problem/2439
 */
public class BOJ_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0 ; i < num ; i++) {
			for(int a = num-1 ; a > i ; a--) {
				System.out.print(" ");
			}
			for(int b = 0 ; b <= i ; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
