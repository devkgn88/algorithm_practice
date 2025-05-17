package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 2577
 * 문제명: 숫자의 개수
 * 문제 링크: https://www.acmicpc.net/problem/2577
 */
public class BOJ_2577 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			int a = Integer.parseInt(br.readLine().trim());
			int b = Integer.parseInt(br.readLine().trim());
			int c = Integer.parseInt(br.readLine().trim());
			
			long m = a*b*c;
			String[] arr = String.valueOf(m).split("");
			int[] result = new int[10];
			for(int i = 0 ; i < arr.length ; i++) {
				result[Integer.parseInt(arr[i])] += 1; 
			}
			for(int i = 0; i < result.length ; i++) {
				bw.write(String.valueOf(result[i]));
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
