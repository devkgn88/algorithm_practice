package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 26546
 * 문제명: Reverse
 * 문제 링크: https://www.acmicpc.net/problem/26546
 */
public class BOJ_26546 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			
			for(int a = 0 ; a < n ; a++) {
				String[] arr = br.readLine().trim().split("\\s+");
				
				String str = arr[0];
				int i = Integer.parseInt(arr[1]);
				int j = Integer.parseInt(arr[2]);
				
				StringBuilder sb = new StringBuilder();
				sb.append(str.substring(0,i));
				sb.append(str.subSequence(j, str.length()));
				
				bw.write(sb.toString());
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
