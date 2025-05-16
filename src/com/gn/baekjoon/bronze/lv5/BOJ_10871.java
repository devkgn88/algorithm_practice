package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 10871
 * 문제명: X보다 작은 수
 * 문제 링크: https://www.acmicpc.net/problem/10871
 */
public class BOJ_10871 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

			String[] line_1 = br.readLine().trim().split("\\s+");
			long x = Long.parseLong(line_1[1]);
			
			String line_2 = br.readLine().trim();
			String[] arr = line_2.split(" ");
			for(String str : arr) {
				long target = Long.parseLong(str);
				if(target < x) {
					bw.write(target+" ");
				}
			}
			bw.flush();			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
