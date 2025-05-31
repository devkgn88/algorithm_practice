package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 4 
 * 문제 번호: 2839
 * 문제명: 설탕 배달
 * 문제 링크: https://www.acmicpc.net/problem/2839
 */
public class BOJ_2839 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			int b = 5001;
			
			int x = n % 5 == 0 ? n/5 : n/5 +1;
			int y = n % 3 == 0 ? n/3 : n/3 +1;
			
			for(int i = 0 ; i <= x ; i++) {
				for(int j = 0 ; j <= y ; j++) {
					
					if(i*5 + j*3 == n
							&& i+j < b) {
						b = i+j;
					}
				}
			}
			
			bw.write(String.valueOf(b == 5001 ? -1 : b));
			
		}catch(Exception e) {
	 		e.printStackTrace();
		}	
	}
}
