package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 2292
 * 문제명: 벌집
 * 문제 링크: https://www.acmicpc.net/problem/2292
 */
public class BOJ_2292 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			long n = Long.parseLong(br.readLine().trim());
			long layer = 1;
			long max = 1;
			while(n > max) {
				max += 6 * layer;
				layer++;
			}
			bw.write(String.valueOf(layer));
			bw.flush();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
