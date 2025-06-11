package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 30007
 * 문제명: 라면 공식
 * 문제 링크: https://www.acmicpc.net/problem/30007
 */
public class BOJ_30007 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < n ; i++) {
				String[] temp = br.readLine().trim().split("\\s+");
				int a = Integer.parseInt(temp[0]);
				int b = Integer.parseInt(temp[1]);
				int x = Integer.parseInt(temp[2]);
				
				int w = a*(x-1) + b;
				bw.write(String.valueOf(w));
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
