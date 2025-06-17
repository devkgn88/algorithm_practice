package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 레벨 : 실버 5
 * 문제 번호: 25206
 * 문제명: 너의 평점은
 * 문제 링크: https://www.acmicpc.net/problem/25206
 */
public class BOJ_25206 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			double total_score = 0.0;
			double total_sum = 0.0;
			
			Map<String,Double> map = new HashMap<String,Double>();
			map.put("A+", 4.5);
			map.put("A0", 4.0);
			map.put("B+", 3.5);
			map.put("B0", 3.0);
			map.put("C+", 2.5);
			map.put("C0", 2.0);
			map.put("D+", 1.5);
			map.put("D0", 1.0);
			map.put("F", 0.0);
			
			for(int i = 0 ; i < 20 ; i++) {
				String[] line = br.readLine().trim().split("\\s+");
				double score = Double.parseDouble(line[1]);
				String earn = line[2];
				
				if(!earn.equals("P")) {
					total_score += score;
					total_sum += (score * map.get(earn));
				}
				
			}
			
			bw.write(String.valueOf(total_sum/total_score));
			bw.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
