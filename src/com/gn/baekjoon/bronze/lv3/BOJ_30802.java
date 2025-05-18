package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 30802
 * 문제명: 웰컴 키트
 * 문제 링크: https://www.acmicpc.net/problem/30802
 */
public class BOJ_30802 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			long n = Long.parseLong(br.readLine().trim());
			String[] size_arr = makeArr(br.readLine());
			String[] group_arr = makeArr(br.readLine());
			
			long t = Long.parseLong(group_arr[0]);
			long p = Long.parseLong(group_arr[1]);
			
			long t_cnt = 0;
			for(String size_str : size_arr) {
				long size = Long.parseLong(size_str);
				t_cnt += size / t; 
				if(size % t != 0) {
					t_cnt += 1;
				}
			}
			bw.write(String.valueOf(t_cnt));
			bw.newLine();
			bw.write((n/p)+" "+(n%p));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String[] makeArr(String str) {
		return str.trim().split("\\s+");
	}
}
