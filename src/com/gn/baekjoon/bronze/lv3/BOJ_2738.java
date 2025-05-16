package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2738
 * 문제명: 행렬 덧셈
 * 문제 링크: https://www.acmicpc.net/problem/2738
 */
public class BOJ_2738 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			int[][] a = new int[n][m];
			int[][] b = new int[n][m];
			
			for(int i = 0 ; i < a.length; i++) {
				String[] line = br.readLine().trim().split("\\s+");
				for(int j = 0 ; j < a[i].length ; j++) {
					a[i][j] = Integer.parseInt(line[j]);
				}
			}
			for(int i = 0 ; i < b.length ; i++) {
				String[] line = br.readLine().trim().split("\\s+");
				for(int j = 0 ; j < b[i].length ; j++) {
					bw.write(String.valueOf(a[i][j]+Integer.parseInt(line[j]))+" ");
				}
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
