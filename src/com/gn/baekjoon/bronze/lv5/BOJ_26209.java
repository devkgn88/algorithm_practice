package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 26209
 * 문제명: Intercepting Information
 * 문제 링크: https://www.acmicpc.net/problem/26209
 */
public class BOJ_26209 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			
			String result = "S";
			
			for(String str : arr) {
				if(str.equals("9")) {
					result = "F";
					break;
				}
			}
			
			System.out.println(result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
