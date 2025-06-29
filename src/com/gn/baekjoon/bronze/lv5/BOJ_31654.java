package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 31654
 * 문제명: Adding Trouble
 * 문제 링크: https://www.acmicpc.net/problem/31654
 */
public class BOJ_31654 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			long c = Long.parseLong(arr[2]);
			
			bw.write(a+b == c ? "correct!" : "wrong!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
