package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4 
 * 문제 번호: 5300
 * 문제명: Fill the Rowboats!
 * 문제 링크: https://www.acmicpc.net/problem/5300
 */
public class BOJ_5300 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int number = Integer.parseInt(br.readLine().trim());
			int count = 1;
			
			for(int i = 1; i <= number ; i++) {
				if(count == 6 || i == number) {
					bw.write(i+" Go! ");
					count = 0;
				} else {
					bw.write(i+" ");
				}
				count ++;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
