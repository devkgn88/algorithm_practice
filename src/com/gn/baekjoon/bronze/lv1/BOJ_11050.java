package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 11050
 * 문제명: 이항 계수 1
 * 문제 링크: https://www.acmicpc.net/problem/11050
 */
public class BOJ_11050 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int k = Integer.parseInt(arr[1]);
			
			bw.write(String.valueOf(fac(n)/(fac(k)*fac(n-k))));
			
		}catch(Exception e) {
	 		e.printStackTrace();
		}		
	}
	
	
	public static long fac(int num) {
		long result = 1;
		for(int i = 1 ; i <= num  ; i++) {
			result *= i;
		}
		return result;
	}
}
