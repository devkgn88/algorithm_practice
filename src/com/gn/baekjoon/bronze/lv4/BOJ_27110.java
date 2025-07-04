package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 27110
 * 문제명: 특식 배부
 * 문제 링크: https://www.acmicpc.net/problem/27110
 */
public class BOJ_27110 {
	public static void main(String[] args){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			int n = Integer.parseInt(br.readLine().trim());
			String[] arr = br.readLine().trim().split("\\s+");

			int sum = 0;			

			for(String str : arr){
				int num = Integer.parseInt(str);
				if(num <= n){
					sum += num;
				} else{
					sum += n;
				}
			}			
            
            bw.write(String.valueOf(sum));
    
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
