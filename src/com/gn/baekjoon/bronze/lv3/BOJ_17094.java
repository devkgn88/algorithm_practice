package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 17094
 * 문제명: Serious Problem
 * 문제 링크: https://www.acmicpc.net/problem/17094
 */
public class BOJ_17094 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int size = Integer.parseInt(br.readLine().trim());
			int number = 0;
			int alpha = 0;
			
			String s = br.readLine().trim();
			
			for(int i = 0 ; i < size ; i++) {
				if(s.charAt(i) == '2') {
					number += 1;
				}else {
					alpha += 1;
				}
				
				if(number > size-i-1+alpha) {
					bw.write("2");
					break;
				}
				
				if(alpha > size-i-1+number) {
					bw.write("e");
					break;
				}
			}
			
			if(number == alpha) {
				bw.write("yee");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
