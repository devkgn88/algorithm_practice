package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 4101
 * 문제명: 크냐?
 * 문제 링크: https://www.acmicpc.net/problem/4101
 */
public class BOJ_4101 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			while(true) {
				String[] arr = br.readLine().trim().split("\\s+");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				if(a==0 && b==0) break;
				if(a>b) bw.write("Yes");
				else bw.write("No");
				bw.newLine();
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
