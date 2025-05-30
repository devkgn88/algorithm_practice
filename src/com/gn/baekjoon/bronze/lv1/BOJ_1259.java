package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 1259
 * 문제명: 팰린드롬수
 * 문제 링크: https://www.acmicpc.net/problem/1259
 */
public class BOJ_1259 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String str;
			while(!"0".equals(str = br.readLine().trim())) {
				
				String result = "yes";
				for(int i = 0 ; i < str.length()/2 ; i++) {
					if(str.charAt(i) != str.charAt(str.length()-1-i)) {
						result = "no";
						break;
					}
				}
				bw.write(result);
				bw.newLine();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
