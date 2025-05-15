package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 14681
 * 문제명: 사분면 고르기
 * 문제 링크: https://www.acmicpc.net/problem/14681
 */
public class BOJ_14681 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine()); 
			int b = Integer.parseInt(br.readLine());
			
			boolean x = a > 0 ? true : false;
			boolean y = b > 0 ? true : false;
			
			if(x && y) System.out.println(1);
			if(!x && y) System.out.println(2);
			if(!x && !y) System.out.println(3);
			if(x && !y) System.out.println(4);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
