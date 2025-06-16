package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 10988
 * 문제명: 팰린드롬인지 확인하기
 * 문제 링크: https://www.acmicpc.net/problem/10988
 */
public class BOJ_10988 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String str = br.readLine().trim();
			
			boolean result = true;
			for(int i = 0 ; i < str.length()/2 ; i++) {
				if(str.charAt(i) != str.charAt(str.length()-i-1)) {
					result = false;
				}
			}
			
			bw.write(result ? "1" : "0");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
