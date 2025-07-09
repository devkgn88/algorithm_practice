package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 2386
 * 문제명: 도비의 영어 공부
 * 문제 링크: https://www.acmicpc.net/problem/2386
 */
public class BOJ_2386 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String line;
			while(!(line=br.readLine().trim()).equals("#")) {
				char alpha = line.charAt(0);
				int count = 0;
				String str1 = line.substring(2, line.length()).toLowerCase();
				for(char s : str1.toCharArray()) {
					if(s == alpha) count++;
				}
				bw.write(alpha+" "+count);
				bw.newLine();
				bw.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
