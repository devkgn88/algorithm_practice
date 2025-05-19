package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 5
 * 문제 번호: 1436
 * 문제명: 영화감독 숌
 * 문제 링크: https://www.acmicpc.net/problem/1436
 */
public class BOJ_1436 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int cnt = 0;
			int goal = Integer.parseInt(br.readLine().trim());
			for(int i = 666 ; ; i++) {
				String str = String.valueOf(i);
				if(str.contains("666")) cnt++;
				if(goal == cnt) {
					bw.write(str);
					break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
