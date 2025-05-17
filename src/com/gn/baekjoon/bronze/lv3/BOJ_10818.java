package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 10818
 * 문제명: 최소, 최대
 * 문제 링크: https://www.acmicpc.net/problem/10818
 */
public class BOJ_10818 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			long n = Long.parseLong(br.readLine().trim());
			
			String[] arr = br.readLine().trim().split("\\s+");
			long init = Long.parseLong(arr[0]); 
			long min = init;
			long max = init;
			for(int i = 1 ; i < n ; i++) {
				long num = Long.parseLong(arr[i]);
				if(num < min) min = num;
				if(max < num) max = num; 
			}
			bw.write(min+" "+max);
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
