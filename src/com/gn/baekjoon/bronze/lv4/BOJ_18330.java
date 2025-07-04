package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 18330
 * 문제명: Petrol
 * 문제 링크: https://www.acmicpc.net/problem/18330
 */
public class BOJ_18330 {
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			// 쓰고 싶은 것 
			int n = Integer.parseInt(br.readLine().trim());
			// 갖고 있는 것
			int k = Integer.parseInt(br.readLine().trim());
			
			int now = k + 60;
			int money = 0;			

			if(now > n){
				money = 1500 * n;
			} else{
				money = (1500 * now) + (3000*(n-now));
			}		

			bw.write(String.valueOf(money));
	
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
