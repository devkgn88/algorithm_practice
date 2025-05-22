package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 5
 * 문제 번호: 1193
 * 문제명: 분수찾기
 * 문제 링크: https://www.acmicpc.net/problem/1193
 */
public class BOJ_1193 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			long x = Long.parseLong(br.readLine().trim());
			String result = "";
			long count = 1L;
			Loop1 : 
			for(long i = 1L ; ; i++) {
				Loop2 : 
				for(long j = 0L ; j < i ; j++) {
					if(count == x) {
						if(i%2 == 0) {
							result = (j+1)+"/"+(i-j);
						} else{
							result = (i-j)+"/"+(j+1);
						}
						break Loop1;
					}
					count++;
				}
				
			}
			bw.write(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
