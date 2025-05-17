package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2 
 * 문제 번호: 8953
 * 문제명: OX퀴즈
 * 문제 링크: https://www.acmicpc.net/problem/8953
 */
public class BOJ_8958 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			long num = Long.parseLong(br.readLine().trim());
			for(int i = 0 ; i < num ; i++) {
				String[] arr = br.readLine().trim().split("");
				int one = 0;
				int sum = 0;
				for(int j = 0 ; j < arr.length ; j++) {
					if(arr[j].equals("O")) {
						one += 1;
						sum += one;
					} else {
						one = 0; 
					}
				}
				bw.write(String.valueOf(sum));
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
