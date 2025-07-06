package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 6502
 * 문제명: 동혁 피자
 * 문제 링크: https://www.acmicpc.net/problem/6502
 */
public class BOJ_6502 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String str;
			int idx = 1;
			while(!(str = br.readLine()).equals("0")) {
				String[] temp = str.trim().split("\\s+");
				double r = Double.parseDouble(temp[0]); // 식탁의 반지름
				int w = Integer.parseInt(temp[1]); // 피자의 너비
				int l = Integer.parseInt(temp[2]); // 피자의 높이
				
				double c = Math.sqrt(Math.pow(w, 2.0) + Math.pow(l, 2.0));
				
				if(c <= 2*r) {
					bw.write("Pizza "+idx+" fits on the table.\n");
				}else {
					bw.write("Pizza "+idx+" does not fit on the table.\n");
				}
				idx++;
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
