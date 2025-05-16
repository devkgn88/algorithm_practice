package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10951
 * 문제명: A+B-4
 * 문제 링크: https://www.acmicpc.net/problem/10951
 */
public class BOJ_10951 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String line;
			while((line = br.readLine()) != null && !line.isEmpty()) {
				String[] arr = line.trim().split("\\s+");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				bw.write(String.valueOf(a+b));
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
