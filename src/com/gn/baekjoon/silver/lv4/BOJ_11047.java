package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 레벨 : 실버 4 
 * 문제 번호: 11047
 * 문제명: 동전 0
 * 문제 링크: https://www.acmicpc.net/problem/11047
 */
public class BOJ_11047 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			long k = Long.parseLong(arr[1]);
			
			List<Long> list = new ArrayList<Long>();
			for(int i = 0 ; i < n ; i++) {
				long coin = Long.parseLong(br.readLine().trim());
				if(coin <= k) {
					list.add(coin);
				}
			}
			
			int sum = 0 ;
					
			for(int i = list.size()-1 ; 0 <= i ; i--) {
				long coin = list.get(i);
				if(k / coin >= 1) {
					sum += k/coin;
					k %= coin;
				}
				if(k == 0) break;
			}
			
			bw.write(String.valueOf(sum));

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
