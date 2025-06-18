package com.gn.baekjoon.bronze.lv4;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 33701
 * 문제명: 새천년관
 * 문제 링크: https://www.acmicpc.net/problem/33701
 */
public class BOJ_33701 {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("");
		name.append("nku");
		
		int length = (int)(Math.random()*44);

		for(int i = 0 ; i <= length ; i++) {
			char alpha = (char)((int)(Math.random()*26)+97);
			name.append(alpha);
		}

		name.append("gwan");
		
		System.out.println(name);
	}
}
