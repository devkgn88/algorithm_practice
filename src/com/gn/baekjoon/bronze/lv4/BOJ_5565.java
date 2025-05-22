package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 5565
 * 문제명: 영수증
 * 문제 링크: https://www.acmicpc.net/problem/5565
 */
public class BOJ_5565 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			int sum = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < 9 ; i++) {
				sum -= Integer.parseInt(br.readLine().trim());
			}
			bw.write(String.valueOf(sum));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
