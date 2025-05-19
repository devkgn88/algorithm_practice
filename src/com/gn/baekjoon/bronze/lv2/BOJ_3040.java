package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 3040
 * 문제명: 백설 공주와 일곱 난쟁이
 * 문제 링크: https://www.acmicpc.net/problem/3040
 */
public class BOJ_3040 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int[] arr = new int[9];
			int sum = 0;
			
			for(int i = 0 ; i < 9 ; i++) {
				int each = Integer.parseInt(br.readLine().trim());
				arr[i] = each;
				sum += each;
			}
			int left = sum-100;
			
			int a = 0;
			int b = 0;
			
			for(int i = 0 ; i < arr.length; i++) {
				for(int j = i+1 ; j < arr.length ; j++) {
					if(arr[i]+arr[j] == left) {
						a = arr[i];
						b = arr[j];
						break;
					}
				}
			}
			
			for(int num : arr) {
				if(num != a && num != b) {
					bw.write(String.valueOf(num));
					bw.newLine();
				}
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
