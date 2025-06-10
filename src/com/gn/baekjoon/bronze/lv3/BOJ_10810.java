package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 10810
 * 문제명: 공 넣기
 * 문제 링크: https://www.acmicpc.net/problem/10810
 */
public class BOJ_10810 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			int[] basket = new int[n+1];
			for(int a = 0 ; a < m ; a++) {
				String[] temp = br.readLine().trim().split("\\s+");
				int i = Integer.parseInt(temp[0]);
				int j = Integer.parseInt(temp[1]);
				int k = Integer.parseInt(temp[2]);
				
				for(int b = i ; b <= j ; b++) {
					basket[b] = k;
				}
			}
			
			for(int i = 1 ; i < basket.length ; i++) {
				bw.write(String.valueOf(basket[i])+" ");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
}
