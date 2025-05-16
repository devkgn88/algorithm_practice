package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2741
 * 문제명: N찍기
 * 문제 링크: https://www.acmicpc.net/problem/2741
 */
public class BOJ_2741 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        for(long i = 1 ; i <= num ; i++) {
        	System.out.println(i);
        }
        sc.close();
	}
}
