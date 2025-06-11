package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 4766
 * 문제명: 일반 화학 실험
 * 문제 링크: https://www.acmicpc.net/problem/4766
 */
public class BOJ_4766 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			float back = 0.0f;
			int count = 0;
			
			while(true) {
				float temp = Float.parseFloat(br.readLine());
				if(temp == 999f) {
					break;
				} else {
					if(count != 0) {
						String result = String.format("%.2f", temp-back);
						bw.write(result);
						bw.newLine();
					}
					back = temp;
				}
				count++;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
