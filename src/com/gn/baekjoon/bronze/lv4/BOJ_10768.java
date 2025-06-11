package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4 
 * 문제 번호: 10768
 * 문제명: 특별한 날
 * 문제 링크: https://www.acmicpc.net/problem/10768
 */
public class BOJ_10768 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int m = Integer.parseInt(br.readLine().trim());
			int d = Integer.parseInt(br.readLine().trim());
			
			if(m == 2) {
				
				if(d == 18) {
					bw.write("Special");
				} else if(d < 18) {
					bw.write("Before");
				} else {
					bw.write("After");
				}
				
			} else if(m < 2) {
				bw.write("Before");
			} else {
				bw.write("After");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
