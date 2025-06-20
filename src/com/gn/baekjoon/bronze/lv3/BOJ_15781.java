package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 15781
 * 문제명: 헬멧과 조끼
 * 문제 링크: https://www.acmicpc.net/problem/
 */
public class BOJ_15781 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			String[] h = br.readLine().trim().split("\\s+");
			String[] a = br.readLine().trim().split("\\s+");
			
			BigInteger max_h = new BigInteger("0");
			BigInteger max_a = new BigInteger("0");
			
			for(int i = 0 ; i < n ; i++) {
				BigInteger temp_h = new BigInteger(h[i]);
				if(max_h.compareTo(temp_h) < 0) {
					max_h = temp_h;
				}
			}
			
			for(int i = 0 ; i < m ; i++) {
				BigInteger temp_a = new BigInteger(a[i]);
				if(max_a.compareTo(temp_a) < 0) {
					max_a = temp_a;
				}
			}
			
			bw.write(max_h.add(max_a).toString());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
