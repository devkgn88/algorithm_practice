package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 27866
 * 문제명: 문자와 문자열
 * 문제 링크: https://www.acmicpc.net/problem/27866
 */
public class BOJ_27866 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			char[] arr = br.readLine().trim().toCharArray();
			int i = Integer.parseInt(br.readLine().trim());
			bw.write(arr[i-1]);
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
