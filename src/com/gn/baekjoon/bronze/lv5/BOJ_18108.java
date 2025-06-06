package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 18108
 * 문제명: 1998년생인 내가 태국에서는 2541년생?!
 * 문제 링크: https://www.acmicpc.net/problem/18108
 */
public class BOJ_18108 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int y = Integer.parseInt(br.readLine().trim());
			bw.write(String.valueOf(y-2541+1998));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
