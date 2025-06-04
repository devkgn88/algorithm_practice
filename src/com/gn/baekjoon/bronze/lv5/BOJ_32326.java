package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 32326
 * 문제명: Convdyor Belt Sushi
 * 문제 링크: https://www.acmicpc.net/problem/32326
 */
public class BOJ_32326 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int r = Integer.parseInt(br.readLine().trim());
			int g = Integer.parseInt(br.readLine().trim());
			int b = Integer.parseInt(br.readLine().trim());
			
			bw.write(String.valueOf(r * 3 + g * 4 + b * 5));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
