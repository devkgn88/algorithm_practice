package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3 
 * 문제 번호: 26645
 * 문제명: 성장의 비약 선택권
 * 문제 링크: https://www.acmicpc.net/problem/26645
 */
public class BOJ_26645 {
	public static void main(String[] args) {
		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			) {
				int n = Integer.parseInt(br.readLine().trim());

				if(n >= 200 && n <= 205) {
					bw.write("1");
				} else if(n >= 206 && n <= 217) {
					bw.write("2");
				} else if(n >= 218 && n <= 228) {
					bw.write("3");
				} else {
					bw.write("4");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
