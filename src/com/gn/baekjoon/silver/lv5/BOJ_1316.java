package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 5
 * 문제 번호: 1316
 * 문제명: 그룹 단어 체커
 * 문제 링크: https://www.acmicpc.net/problem/1316
 */
public class BOJ_1316 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			// -97
			int count = 0;
			
			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < n ; i++) {
				String word = br.readLine().trim();
				int[] alpha = new int[26];
				char front = '0';
				boolean result = true;
				for(int j = 0 ; j < word.length() ; j++) {
					char end = word.charAt(j);
					if(front != end
						&& alpha[(int)end-97] != 0) {
						result = false;
						break;
					}
					alpha[(int)end-97] = alpha[(int)end-97] +1;
					front = end;
				}
				
				if(result) {
					count++;
				}
			}
			
			bw.write(String.valueOf(count));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
