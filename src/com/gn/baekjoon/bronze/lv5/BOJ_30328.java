package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 30328
 * 문제명: Java Warriors
 * 문제 링크: https://www.acmicpc.net/problem/30328
 */
public class BOJ_30328 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			
			int m = n*4000;
			
			bw.write(String.valueOf(m));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
