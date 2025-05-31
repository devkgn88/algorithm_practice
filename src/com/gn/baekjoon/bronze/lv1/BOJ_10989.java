package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 10989
 * 문제명: 수 정렬하기3
 * 문제 링크: https://www.acmicpc.net/problem/10989
 */
public class BOJ_10989 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int[] arr = new int[10000000];
			
			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < n ; i++) {
				int temp = Integer.parseInt(br.readLine().trim());
				arr[temp] += 1;
			}
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i] != 0) {
					for(int j = 0 ; j < arr[i] ; j++) {
						bw.write(String.valueOf(i));
						bw.newLine();
					}
				}
			}
			
		}catch(Exception e) {
	 		e.printStackTrace();
		}
	}
}
