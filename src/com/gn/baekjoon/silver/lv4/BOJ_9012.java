package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 4
 * 문제 번호: 9012
 * 문제명: 괄호
 * 문제 링크: https://www.acmicpc.net/problem/9012
 */
public class BOJ_9012 {
	public static void main(String[] args) {
				
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int t = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < t ; i++) {
				String str = br.readLine().trim();

				while(str.contains("()")) {
					str = str.replace("()", "");
				}
				
				if(str.length() == 0) {
					bw.write("YES\n");
				}else {
					bw.write("NO\n");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
