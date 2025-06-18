package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 32642
 * 문제명: 당구 좀 치자 제발
 * 문제 링크: https://www.acmicpc.net/problem/32642
 */
public class BOJ_32642 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			long sum = 0 ;
			long anger = 0;
			String[] arr = br.readLine().trim().split("\\s+");
			for(int i = 0 ; i < n ; i++) {
				int temp = Integer.parseInt(arr[i]);
				if(temp == 0) {
					anger-- ;
				}else {
					anger ++;
				}
				sum += anger;
			}
			bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
