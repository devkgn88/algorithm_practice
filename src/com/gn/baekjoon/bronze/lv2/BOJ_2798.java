package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 2798
 * 문제명: 블랙잭
 * 문제 링크: https://www.acmicpc.net/problem/2798
 */
public class BOJ_2798 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			String[] num = br.readLine().trim().split("\\s+");
			
			int sum = 0;
			
			for(int a = 0 ; a <= n-3 ; a++ ) {
				for(int b = a+1 ; b <= n-2 ; b++) {
					for(int c = b+1 ; c <= n-1 ; c++) {
						int temp = Integer.parseInt(num[a])
								+ Integer.parseInt(num[b])
								+ Integer.parseInt(num[c]);
						
						if(temp <= m && m-temp < m-sum) {
							sum = temp;
						}

					}
				}
			}
			
			bw.write(String.valueOf(sum));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
