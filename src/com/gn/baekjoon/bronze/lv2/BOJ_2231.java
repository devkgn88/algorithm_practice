package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 2231
 * 문제명: 분해합
 * 문제 링크: https://www.acmicpc.net/problem/2231
 */
public class BOJ_2231 {
	public static void main(String[] args) {
		try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        ) {
			
			long n = Long.parseLong(br.readLine().trim());
			String str = String.valueOf(n);
			int length = str.length();
			boolean flag = false;
			
			for(long i = length*9 ; i >= 1 ;i--) {
				
				long expect = n-i;
				int cnt = 0;
				while(expect > 0) {
					cnt += expect % 10;
					expect /= 10;
				}
				if(cnt == i) {
					flag = true;
					bw.write(String.valueOf(n-i));
					break;
				}
			}
			
			if(!flag) bw.write(String.valueOf(0));
			
			bw.flush();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
