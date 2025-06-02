package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * 레벨 : 실버 4 
 * 문제 번호: 10828
 * 문제명: 스택
 * 문제 링크: https://www.acmicpc.net/problem/10828
 */
public class BOJ_10828 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			
			Stack<Integer> s = new Stack<Integer>();
			
			for(int i = 0 ; i < n ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				switch(arr[0]) {
					case "push" : s.push(Integer.parseInt(arr[1]));break;
					case "pop" : bw.write(String.valueOf(s.empty() ? "-1" : s.pop()));bw.newLine();break;
					case "size" : bw.write(String.valueOf(s.size()));bw.newLine();break;
					case "empty" : bw.write(String.valueOf(s.empty()?"1":"0"));bw.newLine();break;
					case "top" : bw.write(String.valueOf(s.empty() ? "-1" : s.peek()));bw.newLine();break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
