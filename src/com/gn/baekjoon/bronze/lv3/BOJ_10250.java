package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 10250
 * 문제명: ACM 호텔
 * 문제 링크: https://www.acmicpc.net/problem/10250
 */
public class BOJ_10250 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			long t = Long.parseLong(br.readLine());
			
			for(int i = 0 ; i < t ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				long h = Long.parseLong(arr[0]);	// 2층
				long w = Long.parseLong(arr[1]);	// 10칸
				long n = Long.parseLong(arr[2]);	// 3번째
				
				long floor = (n % h == 0 ? h : n % h);
				long room = (n / h)+(n%h == 0 ? 0 : 1);
				
				bw.write(floor+(room/10 == 0 ? "0"+room : ""+room));
				bw.newLine();				
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
