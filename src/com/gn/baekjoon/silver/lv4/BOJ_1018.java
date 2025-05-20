package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 4
 * 문제 번호: 1018
 * 문제명: 체스판 다시 칠하기
 * 문제 링크: https://www.acmicpc.net/problem/1018
 */
public class BOJ_1018 {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			char[][] target = new char[n][m];
			for(int i = 0 ; i < target.length; i++) {
				char[] line = br.readLine().trim().toCharArray();
				for(int j = 0 ; j < target[i].length ; j++) {
					target[i][j] = line[j];
				}
			}
			
			int min = 64;
			

			
			for(int i = 0 ; i <= n - 8 ; i++) {
				for(int j = 0 ; j <= m - 8 ; j++) {
					
					int start_b = 0;
					for(int a = i ; a < i+8 ; a++) {
						for(int b = j ; b < j+8 ; b++) {
							if(a % 2 == 0) {
								if(b % 2 == 0) {
									if(target[a][b] != 'B') {
										start_b ++;
									}
								}else {
									if(target[a][b] != 'W') {
										start_b ++;
									}
								}
							}else {
								if(b % 2 == 0) {
									if(target[a][b] != 'W') {
										start_b ++;
									}
								}else {
									if(target[a][b] != 'B') {
										start_b ++;
									}
								}
							}
						}
					}
					
					int start_w = 0;
					for(int a = i ; a < i+8 ; a++) {
						for(int b = j ; b < j+8 ; b++) {
							if(a % 2 == 0) {
								if(b % 2 == 0) {
									if(target[a][b] != 'W') {
										start_w ++;
									}
								}else {
									if(target[a][b] != 'B') {
										start_w ++;
									}
								}
							}else {
								if(b % 2 == 0) {
									if(target[a][b] != 'B') {
										start_w ++;
									}
								}else {
									if(target[a][b] != 'W') {
										start_w ++;
									}
								}
							}
						}
					}					
					
					start_b = start_b < start_w ? start_b : start_w;
					min = min < start_b ? min : start_b;
				}
			}
			
			bw.write(String.valueOf(min));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
