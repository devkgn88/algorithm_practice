package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 9086
 * 문제명: 문자열
 * 문제 링크: https://www.acmicpc.net/problem/9086
 */
public class BOJ_9086 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int num = Integer.parseInt(br.readLine().trim());
			int cnt = 0;
			while(num != cnt) {
				String[] arr = br.readLine().trim().split("");
				bw.write(arr[0]+arr[arr.length-1]);
				bw.newLine();
				cnt++;
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
