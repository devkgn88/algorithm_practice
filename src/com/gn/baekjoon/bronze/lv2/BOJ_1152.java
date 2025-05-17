package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 1152
 * 문제명: 단어의 개수
 * 문제 링크: https://www.acmicpc.net/problem/1152
 */
public class BOJ_1152 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String[] arr = br.readLine().trim().split("\\s+");
			if(arr.length == 1 && arr[0].equals("")) {
				bw.write(String.valueOf(0));
			} else {
				bw.write(String.valueOf(arr.length));
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
