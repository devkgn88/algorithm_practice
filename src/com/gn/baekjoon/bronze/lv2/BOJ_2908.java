package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 2908
 * 문제명: 상수
 * 문제 링크: https://www.acmicpc.net/problem/2908
 */
public class BOJ_2908 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] temp = br.readLine().trim().split("\\s+");
			
			StringBuilder a = new StringBuilder(temp[0]);
			StringBuilder b = new StringBuilder(temp[1]);
			
			a.reverse();
			b.reverse();
			
			int int_a = Integer.parseInt(a.toString());
			int int_b = Integer.parseInt(b.toString());
			
			bw.write(String.valueOf(int_a > int_b ? int_a : int_b));
			bw.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
