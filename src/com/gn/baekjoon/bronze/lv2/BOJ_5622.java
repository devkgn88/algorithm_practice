package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 5622
 * 문제명: 다이얼
 * 문제 링크: https://www.acmicpc.net/problem/5622
 */
public class BOJ_5622 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			Map<Character,Integer> map = new HashMap<Character,Integer>();
			map.put('A', 2);
			map.put('B', 2);
			map.put('C', 2);
			map.put('D', 3);
			map.put('E', 3);
			map.put('F', 3);
			map.put('G', 4);
			map.put('H', 4);
			map.put('I', 4);
			map.put('J', 5);
			map.put('K', 5);
			map.put('L', 5);
			map.put('M', 6);
			map.put('N', 6);
			map.put('O', 6);
			map.put('P', 7);
			map.put('Q', 7);
			map.put('R', 7);
			map.put('S', 7);
			map.put('T', 8);
			map.put('U', 8);
			map.put('V', 8);
			map.put('W', 9);
			map.put('X', 9);
			map.put('Y', 9);
			map.put('Z', 9);
			
			String str = br.readLine().trim();
			
			int sum = 0;
			
			for(char c : str.toCharArray()) {
				sum += map.get(c) + 1;
			}
			
			bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
			
			
	}
}
