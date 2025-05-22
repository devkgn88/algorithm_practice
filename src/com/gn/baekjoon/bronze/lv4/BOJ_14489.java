package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 14489
 * 문제명: 치킨 두마리(...)
 * 문제 링크: https://www.acmicpc.net/problem/14489
 */
public class BOJ_14489 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			
			long c = Long.parseLong(br.readLine().trim());
			
			if(a+b < c*2) bw.write(String.valueOf(a+b));
			else bw.write(String.valueOf(a+b-c*2));
			
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
