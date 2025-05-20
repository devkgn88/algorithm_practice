package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2338
 * 문제명: 긴자리 계산
 * 문제 링크: https://www.acmicpc.net/problem/2338
 */
public class BOJ_2338 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			BigInteger a = new BigInteger(br.readLine().trim());
			BigInteger b = new BigInteger(br.readLine().trim());
			
			bw.write(String.valueOf(a.add(b)));
			bw.newLine();
			bw.write(String.valueOf(a.subtract(b)));
			bw.newLine();
			bw.write(String.valueOf(a.multiply(b)));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
