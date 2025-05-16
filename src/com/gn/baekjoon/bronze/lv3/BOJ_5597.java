package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 5597
 * 문제명: 과제 안 내신 분...?
 * 문제 링크: https://www.acmicpc.net/problem/5597
 */
public class BOJ_5597 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			int[] arr = new int[30];
			String line;
			while((line = br.readLine()) != null && !line.isEmpty()) {
				int num = Integer.parseInt(line.trim());
				arr[num-1] = 1;
			}
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] == 0) {
					bw.write(String.valueOf(i+1));
					bw.newLine();
				}
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
