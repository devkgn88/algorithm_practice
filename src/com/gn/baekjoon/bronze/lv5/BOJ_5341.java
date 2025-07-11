package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 5341
 * 문제명: 피라미드
 * 문제 링크: https://www.acmicpc.net/problem/5341
 */
public class BOJ_5341 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			String line;
			while(!(line=br.readLine().trim()).equals("0")) {
				int num = Integer.parseInt(line);
				System.out.println(num*(num+1)/2);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
