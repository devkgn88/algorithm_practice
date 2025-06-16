package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 2444
 * 문제명: 별 찍기 - 7
 * 문제 링크: https://www.acmicpc.net/problem/2444
 */
public class BOJ_2444 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 1 ; i <= n-1 ; i ++) {
				for(int a = 1 ; a <= n-i ; a++) {
					bw.write(" ");
				}
				for(int b = 1 ; b <= 2*i-1 ; b++) {
					bw.write("*");
				}
				bw.newLine();
			}
			
			for(int i = 1 ; i <= 2*n-1 ; i++) {
				bw.write("*");
			}
			bw.newLine();
			
			for(int i = n-1 ; 1 <= i ; i--) {
				for(int a = 1 ; a <= n-i ; a++) {
					bw.write(" ");
				}
				for(int b = 1 ; b <= 2*i-1 ; b++) {
					bw.write("*");
				}
				bw.newLine();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
