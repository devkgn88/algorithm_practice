package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 4
 * 문제 번호: 18110
 * 문제명: solved.ac
 * 문제 링크: https://www.acmicpc.net/problem/18110
 */
public class BOJ_18110 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int[] arr = new int[31];
			
			int n = Integer.parseInt(br.readLine().trim());
			
			for(int i = 0 ; i < n ; i++) {
				int temp = Integer.parseInt(br.readLine().trim());
				arr[temp] = arr[temp] + 1;
			}
			
			long num = Math.round(n*0.15);
			
			int cnt = 0;
			int sum = 0;
			
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] != 0) {
					for(int j = 0 ; j < arr[i] ; j++) {
						cnt ++;
						if(num < cnt && cnt <= n-num ) {
							sum += i;
						}
					}
				}
			}
			
			long avg = Math.round((double)sum / (n-num*2));
			bw.write(String.valueOf(avg));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
