package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 15963
 * 문제명: CASIO
 * 문제 링크: https://www.acmicpc.net/problem/15963
 */
public class BOJ_15963 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			long n = Long.parseLong(arr[0]);
			long m = Long.parseLong(arr[1]);
			bw.write(n==m ? "1" : "0");

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
