package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 27590
 * 문제명: Sun and Moon
 * 문제 링크: https://www.acmicpc.net/problem/27590
 */
public class BOJ_27590 {
	public static void main(String[] args) {
		// 2025
		// 2022 -> 2032
		// 2024 -> 2026 -> 2028 -> 2030 -> 2032
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int year = 2025;
			
			String[] d = br.readLine().trim().split("\\s+");
			int ds = Integer.parseInt(d[0]);
			int ys = Integer.parseInt(d[1]);
			
			ds = year - ds;
			
			String[] m = br.readLine().trim().split("\\s+");
			int dm = Integer.parseInt(m[0]);
			int ym = Integer.parseInt(m[1]);
			
			dm = year - dm;
			
			int result = 0;
			
			for(int i = year ; i <= year + 5000 ; i++) {
				if( (i-ds) % ys == 0 && (i-dm) % ym == 0) {
					result = i;
					break;
				}
			}
			
			bw.write(String.valueOf(result - year));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
