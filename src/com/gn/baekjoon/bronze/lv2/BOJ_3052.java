package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2 
 * 문제 번호: 3052
 * 문제명: 나머지
 * 문제 링크: https://www.acmicpc.net/problem/3052
 */
public class BOJ_3052 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			int[] arr = new int[42];
			for(int i = 0 ; i < 10 ; i++) {
				int num = Integer.parseInt(br.readLine().trim());
				arr[num%42] = 1;
			}
			int sum = 0;
			for(int a : arr) {
				sum += a;
			}
			bw.write(String.valueOf(sum));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
