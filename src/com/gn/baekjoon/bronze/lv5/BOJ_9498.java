package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 9498
 * 문제명: 시험 성적
 * 문제 링크: https://www.acmicpc.net/problem/9498
 */
public class BOJ_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char grade = 'F';
		if(60 <= num && num <= 100) {
			if(num >= 90) {
				grade = 'A';
			} else if(num >= 80) {
				grade = 'B';
			} else if(num >= 70) {
				grade = 'C';
			} else if(num >= 60) {
				grade = 'D';
			}
		}
		System.out.println(grade);
		sc.close();
	}
}
