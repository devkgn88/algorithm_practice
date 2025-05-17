package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 11720
 * 문제명: 숫자의 합
 * 문제 링크: https://www.acmicpc.net/problem/11720
 */
public class BOJ_11720 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			br.readLine();
			String[] arr = br.readLine().split("");
			int sum = 0;
			for(String a : arr) {
				sum += Integer.parseInt(a);
			}
			bw.write(String.valueOf(sum));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
