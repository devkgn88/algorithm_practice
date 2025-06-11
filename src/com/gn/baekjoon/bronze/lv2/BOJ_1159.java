package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 1159
 * 문제명: 농구 경기
 * 문제 링크: https://www.acmicpc.net/problem/1159
 */
public class BOJ_1159 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			Map<Character, Integer> map = new HashMap<Character,Integer>();
			
			for(int i = 0 ; i < n ; i++) {
				String name = br.readLine().trim();
				char key = name.charAt(0);
				
				if(map.containsKey(key)) {
					int count = map.get(key);
					map.put(key, count+1);
				} else {
					map.put(key, 1);
				}
			}
			
			Set<Character> set = map.keySet();
			Iterator<Character> it = set.iterator();
			
			boolean exist = false;
			
			while(it.hasNext()) {
				char key = it.next();
				int value = map.get(key);
				if(value >= 5) {
					bw.write(key);
					exist = true;
				}
			}
			
			if(!exist) {
				bw.write("PREDAJA");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
						
	}
}
