package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 2588
 * 문제명: 곱셈
 * 문제 링크: https://www.acmicpc.net/problem/2588
 */
public class BOJ_2588 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			
			String num1 = br.readLine().trim();
			String num2 = br.readLine().trim();
			
			System.out.println(Integer.parseInt(num1) * (num2.charAt(2)-'0'));
			System.out.println(Integer.parseInt(num1) * (num2.charAt(1)-'0'));
			System.out.println(Integer.parseInt(num1) * (num2.charAt(0)-'0'));
			System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
}
