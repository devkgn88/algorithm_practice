package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 레벨 : 실버 5
 * 문제 번호: 11723
 * 문제명: 집합
 * 문제 링크: https://www.acmicpc.net/problem/11723
 */
public class BOJ_11723 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int m = Integer.parseInt(br.readLine().trim());
			
			Set<Integer> s = new HashSet<Integer>();
			
			for(int i = 0 ; i < m ; i++) {
				String[] temp = br.readLine().trim().split("\\s+");
				String word = temp[0];
				switch(word) {
					case "add":
						s.add(Integer.parseInt(temp[1])); break;
					case "remove":
						s.remove(Integer.parseInt(temp[1])); break;
					case "check":
						bw.write((s.contains(Integer.parseInt(temp[1]))? "1" : "0")+"\n"); break;
					case "toggle":
						int num = Integer.parseInt(temp[1]);
						if(s.contains(num)) s.remove(num);
						else s.add(num);
						break;
					case "all" : s.clear();
						Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
						s = new HashSet<Integer>(Arrays.asList(arr));
						break;
					case "empty" : s.clear(); break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
