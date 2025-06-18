package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 27959
 * 문제명: 초코바
 * 문제 링크: https://www.acmicpc.net/problem/27959
 */
public class BOJ_27959 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			bw.write(n*100 >= m ? "Yes" : "No");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
