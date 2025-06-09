package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 28702
 * 문제명: FizzBuzz
 * 문제 링크: https://www.acmicpc.net/problem/28702
 * 히스토리 : 컴파일 에러 1회 발생(import 빠짐)
 */
public class BOJ_28702 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int num = 0;
			int idx = 0;
			
			for(int i = 0 ; i < 3 ; i++) {
				String temp = br.readLine().trim();
				boolean isNumeric = temp.matches("[+-]?\\d*(\\.\\d+)?");
				if(isNumeric) {
					num = Integer.parseInt(temp);
					idx = i;
				}
			}
			
			int next = num + (3-idx);
			
			if(next % 3 == 0 && next % 5 == 0) {
				bw.write("FizzBuzz");
			} else if(next % 3 == 0 && next % 5 != 0 ) {
				bw.write("Fizz");
			} else if(next % 3 != 0 && next % 5 == 0) {
				bw.write("Buzz");
			} else {
				bw.write(String.valueOf(next));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
