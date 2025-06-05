package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 16479
 * 문제명: 컵라면 측정하기
 * 문제 링크: https://www.acmicpc.net/problem/16479
 */
public class BOJ_16479 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int k = Integer.parseInt(br.readLine().trim());
			String[] arr = br.readLine().trim().split("\\s+");
			
			double d1 = Double.parseDouble(arr[0]);
			double d2 = Double.parseDouble(arr[1]);
			
			double result = 0; 
			
			if(d1 == d2) {
				result = k*k;
			} else if(d1 == d2*3 ) {
				result = k*k - d2*d2;
			} else {
				result = k*k - Math.pow(((d1-d2)/2), 2);
			}
			
			bw.write(String.valueOf(result));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
