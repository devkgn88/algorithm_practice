package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10952
 * 문제명: A+B-5
 * 문제 링크: https://www.acmicpc.net/problem/10952
 */
public class BOJ_10952 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			while(true) {
				String[] arr = br.readLine().trim().split("\\s+");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				if(a == 0 && b == 0) break;
				bw.write(String.valueOf(a+b));
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
