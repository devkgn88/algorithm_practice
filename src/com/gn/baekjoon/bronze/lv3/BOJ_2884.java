package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3 
 * 문제 번호: 2884
 * 문제명: 알람시계
 * 문제 링크: https://www.acmicpc.net/problem/2884
 */
public class BOJ_2884 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int h = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);

			if(m < 45) {
				if(h == 0) {
					h = 23;
				} else {
					h -= 1;
				}
				m = 60 - (45-m);
			} else {
				m -= 45;
			}
			bw.write(h + " "+m);
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
