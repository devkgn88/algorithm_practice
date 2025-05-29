package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2742
 * 문제명: 기찍 N
 * 문제 링크: https://www.acmicpc.net/problem/2742
 */
public class BOJ_2742 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			long n = Long.parseLong(br.readLine().trim());
			for(long i = n ; 0 < i ; i--) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
