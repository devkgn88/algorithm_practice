package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2739
 * 문제명: 구구단
 * 문제 링크: https://www.acmicpc.net/problem/2739
 */
public class BOJ_2739 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			int num = Integer.parseInt(br.readLine());
			for(int i = 1; i <= 9 ; i++) {
				bw.write(num+" * "+i+" = "+(num*i));
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
