package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 25341
 * 문제명: 코딩은 체육과목 입니다
 * 문제 링크: https://www.acmicpc.net/problem/25341
 */
public class BOJ_25341 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			
			for(int i = 4 ; i <= n-4 ; i+=4) {
				bw.write("long ");
			}
			bw.write("long int");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
