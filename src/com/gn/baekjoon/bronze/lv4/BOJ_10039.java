package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 10039
 * 문제명: 평균 점수
 * 문제 링크: https://www.acmicpc.net/problem/10039
 */
public class BOJ_10039 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int sum = 0;
			int num = 5; 
			for(int i = 0 ; i < num ; i++) {
				int score = Integer.parseInt(br.readLine().trim());
				if(score < 40) score = 40;
				sum += score;
			}
			
			bw.write(String.valueOf(sum/num));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
