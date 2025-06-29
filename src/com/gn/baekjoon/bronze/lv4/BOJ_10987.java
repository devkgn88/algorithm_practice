package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 10987
 * 문제명: 모음의 개수
 * 문제 링크: https://www.acmicpc.net/problem/10987
 */
public class BOJ_10987 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String word = br.readLine().trim();
			int sum = 0; 
			for(char c : word.toCharArray()) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') sum++;
			}
			
			System.out.println(sum);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
