package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 33178
 * 문제명: Micromasters
 * 문제 링크: https://www.acmicpc.net/problem/33178
 */
public class BOJ_33178 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			bw.write(String.valueOf(n/10));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
