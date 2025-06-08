package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 2525
 * 문제명: 오븐 시계
 * 문제 링크: https://www.acmicpc.net/problem/2525
 */
public class BOJ_2525 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			String[] arr = br.readLine().trim().split("\\s+");
			int hour = Integer.parseInt(arr[0]);
			int min = Integer.parseInt(arr[1]);
			
			int time = Integer.parseInt(br.readLine().trim());
			
			LocalDateTime ldt = LocalDateTime.of(2025, 6, 8, hour, min);
			ldt = ldt.plusMinutes(time);
			
			bw.write(ldt.getHour()+" "+ldt.getMinute());
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
