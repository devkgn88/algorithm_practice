package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 14487	
 * 문제명: 욱제는 효도쟁이야!!
 * 문제 링크: https://www.acmicpc.net/problem/14487
 */
public class BOJ_14487 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			long n = Long.parseLong(br.readLine().trim());
			String[] arr = br.readLine().trim().split("\\s+");
			long max = 0L;
			long sum = 0L;
			for(int i = 0 ; i < arr.length ; i++) {
				long num = Long.parseLong(arr[i]);
				if(max < num) {
					max = num;
				}
				sum += num;
			}
			bw.write(String.valueOf(sum-max));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
