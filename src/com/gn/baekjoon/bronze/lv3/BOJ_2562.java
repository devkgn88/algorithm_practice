package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3 
 * 문제 번호: 2562
 * 문제명: 최댓값
 * 문제 링크: https://www.acmicpc.net/problem/2562
 */
public class BOJ_2562 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			long max = 0L;
			long cnt = 1L;
			for(int i = 1 ; i <= 9 ; i++) {
				long num = Long.parseLong(br.readLine().trim());
				if(max < num) {
					max = num;
					cnt = i;
				}
			}
			bw.write(String.valueOf(max));
			bw.newLine();
			bw.write(String.valueOf(cnt));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
