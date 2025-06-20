package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 22864
 * 문제명: 피로도
 * 문제 링크: https://www.acmicpc.net/problem/22864
 */
public class BOJ_22864 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			long a = Integer.parseInt(arr[0]);
			long b = Integer.parseInt(arr[1]);
			long c = Integer.parseInt(arr[2]);
			long m = Integer.parseInt(arr[3]);
			
			long stress = 0;
			long work = 0; 
			for(int i = 0 ; i < 24 ; i++) {
				if(stress + a <= m) {
					work += b;
					stress += a;
				} else {
					if(stress - c < 0) {
						stress = 0;
					}else {
						stress -= c;
					}
				}
			}
			bw.write(String.valueOf(work));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
