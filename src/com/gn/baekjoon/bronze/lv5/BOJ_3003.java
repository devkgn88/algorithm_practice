package com.gn.baekjoon.bronze.lv5;

import java.util.Scanner;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 3003
 * 문제명: 킹, 퀸, 룩, 비숍, 나이트, 폰
 * 문제 링크: https://www.acmicpc.net/problem/
 */
public class BOJ_3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s_arr = str.split(" ");
		long[] r_arr = new long[s_arr.length];
		
		long[] t_arr = {1,1,2,2,2,8};
		for(int i = 0 ; i < t_arr.length ; i++) {
			long s_num = Long.parseLong(s_arr[i]);
			if(s_num != t_arr[i]) {
				r_arr[i] = t_arr[i]-s_num;
			}
		}
		
		for(long r : r_arr) {
			System.out.print(r+" ");
		}
		
		
		sc.close();
	}

}
