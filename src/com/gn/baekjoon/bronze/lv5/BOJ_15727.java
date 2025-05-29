package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 15727
 * 문제명: 조별과제를 하려는데 조장이 사라졌다
 * 문제 링크: https://www.acmicpc.net/problem/15727
 */
public class BOJ_15727 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			long l = Long.parseLong(br.readLine().trim());
			long t = l%5 == 0 ? l/5 : l/5 +1 ;
			
			bw.write(String.valueOf(t));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
