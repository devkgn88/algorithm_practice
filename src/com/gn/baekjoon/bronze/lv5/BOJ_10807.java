package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10807
 * 문제명: 개수 세기
 * 문제 링크: https://www.acmicpc.net/problem/10807
 */
public class BOJ_10807 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			br.readLine();
			String[] arr = br.readLine().trim().split("\\s+");
			int v = Integer.parseInt(br.readLine());
			
			int cnt = 0 ;
			for(String str : arr) {
				if(Integer.parseInt(str)==v) cnt++;
			}
			bw.write(String.valueOf(cnt));
			bw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
