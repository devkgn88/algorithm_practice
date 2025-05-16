package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 11654
 * 문제명: char
 * 문제 링크: https://www.acmicpc.net/problem/11654
 */
public class BOJ_11654 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			
			char c = (br.readLine().trim().split("\\s+"))[0].toCharArray()[0];
			System.out.println((int)c);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
