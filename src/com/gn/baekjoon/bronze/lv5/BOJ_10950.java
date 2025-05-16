package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10950
 * 문제명: A+B-3
 * 문제 링크: https://www.acmicpc.net/problem/10950
 */
public class BOJ_10950 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String tokens = br.readLine();
			
			long cnt = Long.parseLong(tokens);
			
			for(long i = 0 ; i < cnt ; i++) {
				String[] nums = br.readLine().trim().split("\\s+");
				System.out.println(Integer.parseInt(nums[0])+Integer.parseInt(nums[1]));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
