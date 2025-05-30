package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

/**
 * 레벨 : 실버 5
 * 문제 번호: 2751
 * 문제명: 수 정렬하기 2
 * 문제 링크: https://www.acmicpc.net/problem/2751
 */
public class BOJ_2751 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
		
			int n = Integer.parseInt(br.readLine().trim());
			
			Set<Integer> set = new TreeSet<Integer>();
			
			for(int i = 0 ; i < n ; i++) {
				int temp = Integer.parseInt(br.readLine().trim());
				set.add(temp);
			}
			
			for(int s : set) {
				bw.write(String.valueOf(s));
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
