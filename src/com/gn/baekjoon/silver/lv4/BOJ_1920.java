package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * 레벨 : 실버 4
 * 문제 번호: 1920
 * 문제명: 수 찾기
 * 문제 링크: https://www.acmicpc.net/problem/1920
 */
public class BOJ_1920 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			int n = Integer.parseInt(br.readLine().trim());
			Set<Integer> set = new HashSet<Integer>();
			String[] nArr = br.readLine().trim().split("\\s+");
			
			for(int i = 0 ; i < n ; i++) {
				int temp = Integer.parseInt(nArr[i]);	
				set.add(temp);
			}
			
			int m = Integer.parseInt(br.readLine().trim());
			String[] mArr = br.readLine().trim().split("\\s+");
			
			for(int i = 0 ; i < m ; i++) {
				int temp = Integer.parseInt(mArr[i]);
				if(set.contains(temp)) bw.write("1");
				else bw.write("0");
				bw.newLine();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}			
	}
}
