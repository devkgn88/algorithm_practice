package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 9469
 * 문제명: 폰 노이만
 * 문제 링크: https://www.acmicpc.net/problem/9469
 */
public class BOJ_9469 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int p = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < p ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				int n = Integer.parseInt(arr[0]);
				double d = Double.parseDouble(arr[1]);
				double a = Double.parseDouble(arr[2]);
				double b = Double.parseDouble(arr[3]);
				double f = Double.parseDouble(arr[4]);
				
				bw.write(n+" "+((d / (a+b)) * f)+"\n"); 
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
