package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 레벨 : 실버 5
 * 문제 번호: 11650
 * 문제명: 좌표 정렬하기
 * 문제 링크: https://www.acmicpc.net/problem/11650
 */
public class BOJ_11650 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){	
			
			int n = Integer.parseInt(br.readLine().trim());
			
			List<Map<String,Integer>> list = new ArrayList<Map<String,Integer>>(); 

			for(int i = 0 ; i < n ; i++) {
				String[] line = br.readLine().trim().split("\\s+");
				int one = Integer.parseInt(line[0]);
				int two = Integer.parseInt(line[1]);
				
				Map<String,Integer> map = new HashMap<String,Integer>();
				map.put("x", one);
				map.put("y", two);
				list.add(map);
			}
						
			Collections.sort(list, new Comparator<Map<String,Integer>>() {
				@Override
				public int compare(Map<String,Integer> s1, Map<String,Integer> s2) {
					int xCompare = Integer.compare(s1.get("x"), s2.get("x"));
					if (xCompare != 0) {
						return xCompare;
					} else {
						return Integer.compare(s1.get("y"), s2.get("y"));
					}
				}
			});
			
			for(int i = 0 ; i < list.size() ; i++) {
				bw.write(list.get(i).get("x")+" "+list.get(i).get("y"));
				bw.newLine();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
