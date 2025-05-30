package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 33612
 * 문제명: 피갤컵
 * 문제 링크: https://www.acmicpc.net/problem/33612
 */
public class BOJ_33612 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			LocalDate start = LocalDate.of(2024, 8, 1);
			for(int i = 1 ; i < n ; i++) {
				start = start.plusMonths(7);
			}
			bw.write(start.getYear()+" "+start.getMonthValue());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
