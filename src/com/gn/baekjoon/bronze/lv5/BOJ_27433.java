package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 27433
 * 문제명: 팩토리얼 2
 * 문제 링크: https://www.acmicpc.net/problem/27433
 */
public class BOJ_27433 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			long multi = 1; 
			
			for(int i = n ; i > 1 ; i--) {
				multi *= i;
			}
			bw.write(String.valueOf(multi));
			bw.flush();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
