package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 11382
 * 문제명: 꼬마 정민
 * 문제 링크: https://www.acmicpc.net/problem/11382
 */
public class BOj_11382 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] tokens = br.readLine().trim().split("\\s+");
			
			long a = Long.parseLong(tokens[0]);
			long b = Long.parseLong(tokens[1]);
			long c = Long.parseLong(tokens[2]);
			
			System.out.println(a+b+c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
