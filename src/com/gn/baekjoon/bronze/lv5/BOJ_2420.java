package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2420
 * 문제명: 사파리월드
 * 문제 링크: https://www.acmicpc.net/problem/2420
 */
public class BOJ_2420 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] tokens = br.readLine().trim().split("\\s+");
			
			long a = Long.parseLong(tokens[0]);
			long b = Long.parseLong(tokens[1]);
			
			long result = Math.abs(a-b);
			System.out.println(result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
