package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 10813
 * 문제명: 공 바꾸기
 * 문제 링크: https://www.acmicpc.net/problem/10813
 */
public class BOJ_10813 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			int[] basket = new int[n];
			for(int i = 0 ; i < n ; i++) {
				basket[i] = i+1;
			}
			
			for(int a = 0 ; a < m ; a++) {
				String[] line = br.readLine().trim().split("\\s+");
				int i = Integer.parseInt(line[0]);
				int j = Integer.parseInt(line[1]);
				
				int temp = basket[j-1];
				basket[j-1] = basket[i-1];
				basket[i-1] = temp;
			}

			for(int b : basket) {
				bw.write(b+" ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
