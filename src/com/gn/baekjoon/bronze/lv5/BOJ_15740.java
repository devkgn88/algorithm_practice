package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 15740
 * 문제명: A+B-9
 * 문제 링크: https://www.acmicpc.net/problem/15740
 */
public class BOJ_15740 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			BigInteger a = new BigInteger(arr[0]);
			BigInteger b = new BigInteger(arr[1]);
			
			a = a.add(b);
			
			bw.write(a.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
