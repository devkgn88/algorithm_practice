package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 2869
 * 문제명: 달팽이는 올라가고 싶다
 * 문제 링크: https://www.acmicpc.net/problem/2869
 */
public class BOJ_2869 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
		
			String[] arr = br.readLine().trim().split("\\s+");
			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			long v = Long.parseLong(arr[2]);
			
			long r = 1;
			r += (v-a)%(a-b) == 0 ? (v-a)/(a-b) : (v-a)/(a-b)+1;

			bw.write(String.valueOf(r));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
