package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 14626
 * 문제명: ISBN
 * 문제 링크: https://www.acmicpc.net/problem/14626
 */
public class BOJ_14626 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String str = br.readLine().trim();
			int result = 0;
						
			for(int i = 0 ; i <= 9 ;i++) {
				String temp = str.replace("*", String.valueOf(i));
								
				String[] arr = temp.split("");
				int sum = 0;
				
				for(int j = 0 ; j < arr.length ; j++) {
					if(j%2 == 0) {
						sum += Integer.parseInt(arr[j]);
					}else {
						sum += Integer.parseInt(arr[j])*3;
					}
				}
				
				if(sum % 10 == 0) {
					result = i;
					break;
				}
				
			}
			
			bw.write(result >= 10 ? String.valueOf(result-10) : String.valueOf(result));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
						
	}
}
