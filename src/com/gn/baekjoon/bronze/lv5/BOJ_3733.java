package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 3733
 * 문제명: Shares
 * 문제 링크: https://www.acmicpc.net/problem/3733
 */
public class BOJ_3733 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String line;
			while((line = br.readLine()) != null && !line.isEmpty()) {
				String[] arr = line.trim().split("\\s+");
				int n = Integer.parseInt(arr[0]);
				int s = Integer.parseInt(arr[1]);
				bw.write(String.valueOf(s/(n+1)));
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
}
