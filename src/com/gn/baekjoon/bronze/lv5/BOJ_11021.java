package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 11021
 * 문제명: A + B - 7
 * 문제 링크: https://www.acmicpc.net/problem/11021
 */
public class BOJ_11021 {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			
			int t = Integer.parseInt(br.readLine().trim());
			
			for(int i = 1;  i <= t  ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				bw.write("Case #"+i+": "+(a+b));
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
