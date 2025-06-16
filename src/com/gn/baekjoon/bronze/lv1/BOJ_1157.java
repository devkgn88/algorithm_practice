package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1 
 * 문제 번호: 1157
 * 문제명: 단어 공부
 * 문제 링크: https://www.acmicpc.net/problem/1157
 */
public class BOJ_1157 {
	public static void main(String[] args) {
		
		int[] arr = new int[26];
		// 65 ~ 90사이 : -65 처리
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String str = br.readLine().trim().toUpperCase();
			for(char c : str.toCharArray()) {
				int num = (int)c - 65;
				arr[num] = arr[num]+1;
			}
			
			int idx = 0;
			int max = 0;
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] > max) {
					max = arr[i];
					idx = i;
				}
			}
			int count = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] == max) {
					count ++;
				}
			}
			
			if(count > 1) {
				bw.write("?");
			} else {
				bw.write((char)(idx+65));
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
