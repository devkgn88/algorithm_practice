package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 10820
 * 문제명: 문자열 분석
 * 문제 링크: https://www.acmicpc.net/problem/10820
 */
public class BOJ_10820 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			String line;
			
			while((line=br.readLine()) != null) {
				int s = 0;	// small
				int l = 0;	// large
				int n = 0;	// number
				int b = 0;	// blank
				
				char[] arr = line.toCharArray();
				for(char c : arr) {
					int i = (int)c;
					if(97 <= i && i <= 122) {
						s++;
					} else if(65 <= i && i <= 90) {
						l++;
					} else if(47 <= i && i <= 57) {
						n++;
					} else if(i == 32) {
						b++;
					}
				}
				
				bw.write(s+" "+l+" "+n+" "+b);
				bw.newLine();
				bw.flush();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
