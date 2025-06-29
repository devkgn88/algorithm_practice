package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 10822
 * 문제명: 더하기
 * 문제 링크: https://www.acmicpc.net/problem/10822
 */
public class BOJ_10822 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split(",");
			long sum = 0L;
			
			for(int i = 0 ; i < arr.length ; i++) {
				long num = Long.parseLong(arr[i]);
				sum += num;
			}
			
			bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
