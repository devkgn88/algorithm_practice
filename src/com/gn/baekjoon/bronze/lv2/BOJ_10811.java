package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 10811
 * 문제명: 바구니 뒤집기
 * 문제 링크: https://www.acmicpc.net/problem/10811
 */
public class BOJ_10811 {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] nm = br.readLine().trim().split("\\s+");
			
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			
			int[] basket = new int[n];
			
			for(int a = 0 ; a < basket.length ; a++) {
				basket[a] = a+1;
			}
			
			for(int a = 0 ; a < m ; a++) {
				
				String[] ij = br.readLine().trim().split("\\s+");
				int i = Integer.parseInt(ij[0]);
				int j = Integer.parseInt(ij[1]);
				
				int[] portion = new int[n];
				
				int idx = 0;
				
				for(int b = 0 ; b < i-1 ; b++) {
					portion[idx] = basket[b];
					idx++;
				}
				
				for(int c = j-1 ; i-1 <= c ; c--) {
					portion[idx] = basket[c];
					idx++;
				}
				
				for(int d = j ; d < basket.length ; d++) {
					portion[idx] = basket[d];
					idx++;
				}
				basket = portion; 
			}
			
			for(int a = 0 ; a < basket.length ; a++) {
				bw.write(basket[a]+" ");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
