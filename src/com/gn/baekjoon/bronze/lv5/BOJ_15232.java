package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 15232
 * 문제명: Rectangles
 * 문제 링크: https://www.acmicpc.net/problem/15232
 */
public class BOJ_15232 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			int r = Integer.parseInt(br.readLine().trim());
			int c = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < r ; i++) {
				for(int j = 0 ; j < c ; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
