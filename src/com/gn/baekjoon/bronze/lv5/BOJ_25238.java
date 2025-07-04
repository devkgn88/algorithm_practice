package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 25238
 * 문제명: 가희와 방어율 무시
 * 문제 링크: https://www.acmicpc.net/problem/25238
 */
public class BOJ_25238 {
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String[] arr = br.readLine().trim().split("\\s+");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);

			int c = a * (100-b)/100;
			bw.write(c >= 100 ? "0" : "1");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
