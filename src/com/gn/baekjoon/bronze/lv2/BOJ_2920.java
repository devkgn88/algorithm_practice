package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2 
 * 문제 번호: 음계
 * 문제명: 2920
 * 문제 링크: https://www.acmicpc.net/problem/2920
 */
public class BOJ_2920 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] tones = br.readLine().trim().split("\\s+");
			boolean mixed = false;
			int start = 0;
			
			for(int i = 0 ; i< tones.length-1 ; i++) {
				int diff = Integer.parseInt(tones[i])-Integer.parseInt(tones[i+1]);
				if(i == 0) start = diff;
				if(diff != -1 && diff != 1) {
					 mixed = true;
					 break;
				}
			}
			
			if(mixed) {
				bw.write("mixed");
			} else {
				if(start == -1) bw.write("ascending");
				else if(start == 1) bw.write("descending");
			}
			bw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
