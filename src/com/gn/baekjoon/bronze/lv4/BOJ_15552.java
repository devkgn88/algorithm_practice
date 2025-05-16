package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 15552
 * 문제명: 빠른 A+B
 * 문제 링크: https://www.acmicpc.net/problem/15552
 */
public class BOJ_15552 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			long cnt = Long.parseLong(br.readLine());
			for(long i = 0 ; i < cnt ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				bw.write(String.valueOf(Integer.parseInt(arr[0])+Integer.parseInt(arr[1])));
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
