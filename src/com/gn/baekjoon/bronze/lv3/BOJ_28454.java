package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 28454
 * 문제명: Gift Expire Date
 * 문제 링크: https://www.acmicpc.net/problem/28454
 */
public class BOJ_28454 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String str1 = br.readLine().trim();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate check = LocalDate.parse(str1, formatter);
	        
	        int n = Integer.parseInt(br.readLine().trim());
	        int count = 0;
	        
	        for(int i = 0 ; i < n ; i++) {
	        	String str2 = br.readLine().trim();
	        	LocalDate target = LocalDate.parse(str2,formatter);
	        	
	        	if(target.isAfter(check) || target.isEqual(check)) {
	        		count ++;
	        	}
	        }
	        
	        bw.write(String.valueOf(count));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
