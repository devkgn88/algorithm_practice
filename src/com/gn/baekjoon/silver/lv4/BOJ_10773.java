package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * 레벨 : 실버 4
 * 문제 번호: 10773
 * 문제명: 제로
 * 문제 링크: https://www.acmicpc.net/problem/10773
 */
public class BOJ_10773 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int k = Integer.parseInt(br.readLine().trim());
			Stack<Integer> s = new Stack<Integer>();

			for(int i = 0; i < k ; i++) {
				int temp = Integer.parseInt(br.readLine().trim());
				
				if(temp == 0) {
					s.pop();
				} else {
					s.push(temp);
				}
				
			}

			int sum = 0;
	        while (!s.isEmpty()) {
	            sum += s.pop(); 
	        }
	        
	        bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
