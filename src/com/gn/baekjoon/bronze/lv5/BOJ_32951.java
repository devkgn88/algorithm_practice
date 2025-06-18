package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 32951
 * 문제명: AI 선도대학
 * 문제 링크: https://www.acmicpc.net/problem/32951
 */
public class BOJ_32951 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			bw.write(String.valueOf(n-2024));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
