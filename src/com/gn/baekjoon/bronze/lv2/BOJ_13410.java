package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 13410
 * 문제명: 거꾸로 구구단
 * 문제 링크: https://www.acmicpc.net/problem/13410
 */
public class BOJ_13410 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] temp = br.readLine().trim().split("\\s+");
			
			int n = Integer.parseInt(temp[0]);
			int k = Integer.parseInt(temp[1]);
			
			int max = 0;
			
			for(int i = 1 ; i <= k ; i++) {
				int origin = n * i ; 
				StringBuilder sb = new StringBuilder(String.valueOf(origin));
				sb.reverse();
				int flipped = Integer.parseInt(sb.toString());
				if(flipped > max) {
					max = flipped;
				}
			}
			
			bw.write(String.valueOf(max));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
