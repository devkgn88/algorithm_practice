package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 3449
 * 문제명: 해밍 거리
 * 문제 링크: https://www.acmicpc.net/problem/3449
 */
public class BOJ_3449 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int t = Integer.parseInt(br.readLine().trim());
			
			for(int i = 0 ; i < t ; i++) {
				String a = br.readLine().trim();
				String b = br.readLine().trim();
				int d = 0;
				for(int j = 0 ; j < a.length() ; j++) {
					if(a.charAt(j) != b.charAt(j)) d++;
				}
				bw.write("Hamming distance is "+d+".");
				bw.newLine();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
