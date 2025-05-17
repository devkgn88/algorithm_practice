package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 4153
 * 문제명: 직각삼각형
 * 문제 링크: https://www.acmicpc.net/problem/4153
 */
public class BOJ_4153 {
	 public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String line;
			while(!"0 0 0".equals(line = br.readLine().trim())) {
				String result = "wrong";
				String[] arr = line.split("\\s+");
				long a = Long.parseLong(arr[0]);
				long b = Long.parseLong(arr[1]);
				long c = Long.parseLong(arr[2]);
				
				long max = (a > b ? a : b);
				max = max > c ? max : c;
				
				if((Math.pow(a, 2.0)+Math.pow(b, 2.0)+Math.pow(c, 2.0))/2 == Math.pow(max, 2.0)) result = "right";
				bw.write(result);
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
