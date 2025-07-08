package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 27512
 * 문제명: 스네이크
 * 문제 링크: https://www.acmicpc.net/problem/27512
 */
public class BOJ_27512 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
				
				String[] arr = br.readLine().trim().split("\\s+");
				int n = Integer.parseInt(arr[0]);
				int m = Integer.parseInt(arr[1]);
	            	
	            if((n*m)%2 == 0){
	                bw.write(String.valueOf(n*m));
	            } else{
	                bw.write(String.valueOf(n*m -1));
	            }
							
			}catch(Exception e) {
				e.printStackTrace(); 
			}
	}
}
