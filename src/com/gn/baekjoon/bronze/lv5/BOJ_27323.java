package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 27323
 * 문제명: 직사각형
 * 문제 링크: https://www.acmicpc.net/problem/27323
 */
public class BOJ_27323 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int a = Integer.parseInt(br.readLine().trim());
			int b = Integer.parseInt(br.readLine().trim());
			int size = a*b;
			bw.write(String.valueOf(size));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
