package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 
 * 문제 번호: 2675
 * 문제명: 문자열 반복
 * 문제 링크: https://www.acmicpc.net/problem/2675
 */
public class BOJ_2675 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int t = Integer.parseInt(br.readLine().trim());
			
			for(int i = 0 ; i < t ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				
				int time = Integer.parseInt(arr[0]);
				String[] word = arr[1].trim().split("");
				for(int a = 0 ; a < word.length ; a++) {
					for(int b = 0 ; b < time ; b++) {
						bw.write(word[a]);
					}
				}
				bw.newLine();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
