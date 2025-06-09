package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 8393
 * 문제명: 합
 * 문제 링크: https://www.acmicpc.net/problem/8393
 */
public class BOJ_8393 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			int sum = n * (n+1) / 2 ;
			
			bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
