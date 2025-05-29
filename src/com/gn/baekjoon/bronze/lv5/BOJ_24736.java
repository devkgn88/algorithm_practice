package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 24736
 * 문제명: Football Scoring
 * 문제 링크: https://www.acmicpc.net/problem/24736
 */
public class BOJ_24736 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] visiting = br.readLine().trim().split("\\s+");
			String[] home = br.readLine().trim().split("\\s+");
			int[] score = {6,3,2,1,2};
			
			int v_score = 0;
			int h_score = 0;
			
			for(int i = 0 ; i < 5 ; i++) {
				v_score += Integer.parseInt(visiting[i]) * score[i];
				h_score += Integer.parseInt(home[i]) * score[i];
			}
			
			bw.write(v_score + " " + h_score);

		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
