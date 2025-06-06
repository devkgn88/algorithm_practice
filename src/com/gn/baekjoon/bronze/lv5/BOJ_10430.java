package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10430
 * 문제명: 나머지
 * 문제 링크: https://www.acmicpc.net/problem/10430
 */
public class BOJ_10430 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			int C = Integer.parseInt(arr[2]);
			
			bw.write(String.valueOf((A+B)%C));
			bw.newLine();
			bw.write(String.valueOf(((A%C) + (B%C))%C));
			bw.newLine();
			bw.write(String.valueOf((A*B)%C));
			bw.newLine();
			bw.write(String.valueOf(((A%C) * (B%C))%C));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
