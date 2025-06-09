package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 25304
 * 문제명: 영수증
 * 문제 링크: https://www.acmicpc.net/problem/25304
 */
public class BOJ_25304 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int x = Integer.parseInt(br.readLine().trim());
			int n = Integer.parseInt(br.readLine().trim());
			
			int sum = 0 ;
			for(int i = 0 ; i < n ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				
				sum += a*b;
			}
			if(sum == x) bw.write("Yes");
			else bw.write("No");
			
		}catch(Exception e) {
			e.printStackTrace();
		}			
	}
}
