package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 2609 
 * 문제명: 최대공약수와 최소공배수
 * 문제 링크: https://www.acmicpc.net/problem/2609
 */
public class BOJ_2609 {
	 public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			
			int min = Math.min(a, b);
			
			int yak = 1;
			
			for(int i = 2 ; i <= min ; i++) {
				if(a % i == 0 && b % i == 0) {
					yak = i;
				}
			}			
			bw.write(String.valueOf(yak));
			bw.newLine();
			bw.write(String.valueOf(a/yak * b / yak * yak));
			

		}catch(Exception e) {
			e.printStackTrace();
		}		
	 }
}
