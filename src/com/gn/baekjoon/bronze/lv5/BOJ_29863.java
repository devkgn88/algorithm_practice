package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 29863
 * 문제명: Arno's Sleep Schedule
 * 문제 링크: https://www.acmicpc.net/problem/29863
 */
public class BOJ_29863 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			// 20-23 , 0-3
			int sleep = Integer.parseInt(br.readLine().trim());
			// 5-10
			int awake = Integer.parseInt(br.readLine().trim());
			
			int duration = 0;
			
			if(20 <= sleep && sleep <= 23) {
				duration += (24-sleep)+awake;
			} else {
				duration += (awake-sleep);
			}
			bw.write(String.valueOf(duration));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
