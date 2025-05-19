package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 레벨 : 실버 5
 * 문제 번호: 1181
 * 문제명: 단어 정렬
 * 문제 링크: https://www.acmicpc.net/problem/1181
 */
public class BOJ_1181 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
		
			int n = Integer.parseInt(br.readLine().trim());
			
			Set<String> set = new HashSet<String>();
			for(int i = 0 ; i < n ; i++) {
				String word = br.readLine().trim();
				set.add(word);
			}
			
			List<String> list = new ArrayList<String>(set);
			list.sort(new Comparator<String>() {
				@Override
				public int compare(String a, String b) {
					if(a.length() == b.length()) {
						return a.compareTo(b);
					} else {
						if(a.length() < b.length()) {
							return -1;
						} else {
							return 1;
						}
					}
				}
			});
			
			for(String str : list) {
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
