package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 5585
 * 문제명: 거스름돈
 * 문제 링크: https://www.acmicpc.net/problem/5585
 */
public class BOJ_5585 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int price = Integer.parseInt(br.readLine().trim());
			int money = 1000;
			int left = money-price;
			
			int[] coins = new int[]{500,100,50,10,5,1};
			int sum = 0 ;
			
			for(int i = 0 ; i < coins.length ; i++) {
				if(left / coins[i] > 0) {
					sum += left / coins[i];
					left %= coins[i];
				}
			}
			bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
