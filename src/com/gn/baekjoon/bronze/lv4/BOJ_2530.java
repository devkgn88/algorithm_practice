package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 2530 
 * 문제명: 인공지능 시계
 * 문제 링크: https://www.acmicpc.net/problem/2530
 */
public class BOJ_2530 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]); 
			LocalDateTime ldt = LocalDateTime.of(2025, 7, 9, a, b, c);
			
			int d = Integer.parseInt(br.readLine().trim());
			
			ldt = ldt.plusSeconds(d);
			
			bw.write(ldt.getHour()+" "+ldt.getMinute()+" "+ldt.getSecond());
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
