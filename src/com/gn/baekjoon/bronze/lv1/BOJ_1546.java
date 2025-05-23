package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 1546
 * 문제명: 평균
 * 문제 링크: https://www.acmicpc.net/problem/1546
 */
public class BOJ_1546 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			String[] arr = br.readLine().trim().split("\\s+");
			int max = 0; 
			int sum = 0;
			for(String str : arr) {
				int temp = Integer.parseInt(str);
				sum += temp;
				if(max < temp) max = temp;
			}			
			double result = (double)sum / max * 100 / n;
			bw.write(String.valueOf(result));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
