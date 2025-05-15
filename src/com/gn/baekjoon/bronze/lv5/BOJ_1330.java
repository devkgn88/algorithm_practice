package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 1330
 * 문제명: 두 수 비교하기
 * 문제 링크: https://www.acmicpc.net/problem/1330
 */
public class BOJ_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		long a = Long.parseLong(arr[0]);
		long b = Long.parseLong(arr[1]);
		if(a == b) {
			System.out.println("==");			
		}else {
			if(a<b) {
				System.out.println("<");
			} else {
				System.out.println(">");
			}
		}
		
		sc.close();
	}
}
