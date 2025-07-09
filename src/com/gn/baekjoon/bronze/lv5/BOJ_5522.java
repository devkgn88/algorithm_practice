package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 5522
 * 문제명: 카드 게임
 * 문제 링크: https://www.acmicpc.net/problem/5522
 */
public class BOJ_5522 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			BigInteger sum = new BigInteger("0");
			
			for(int i = 0 ; i < 5 ; i++) {
				String str = br.readLine().trim();
				sum = sum.add(new BigInteger(str));
			}
			
			bw.write(sum.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
