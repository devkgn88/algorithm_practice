package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 실버 5
 * 문제 번호: 1676
 * 문제명: 팩토리얼 0의 개수
 * 문제 링크: https://www.acmicpc.net/problem/1676
 */
public class BOJ_1676 {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			BigInteger result = new BigInteger("1");
			
			int n = Integer.parseInt(br.readLine().trim());
			
			for(int i = 1 ; i <= n ; i++) {
				result = result.multiply(new BigInteger(String.valueOf(i)));
			}
			
			String[] arr = result.toString().split("");
			int count = 0;
			for(int i = arr.length-1 ; 0 <= i ; i--) {
				if(arr[i].equals("0")) {
					count ++;
				}else {
					break;
				}
			}
			
			bw.write(String.valueOf(count));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
