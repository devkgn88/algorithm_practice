package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2743
 * 문제명: 단어 길이 재기
 * 문제 링크: https://www.acmicpc.net/problem/2743
 */
public class BOJ_2743 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String str = br.readLine();
			int length = str.length();
			bw.write(String.valueOf(length));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
