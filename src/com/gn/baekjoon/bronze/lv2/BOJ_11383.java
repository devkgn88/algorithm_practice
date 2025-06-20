package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 11383
 * 문제명: 뚊
 * 문제 링크: https://www.acmicpc.net/problem/11383
 */
public class BOJ_11383 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			String[] words = new String[n];
			
			for(int i = 0 ; i < n ; i++) {
				String word = br.readLine().trim();
				String target = "";
				for(int j = 0 ; j < m ; j++) {
					target += word.charAt(j);
					target += word.charAt(j);
				}
				words[i] = target;
			}
			
			String result = "Eyfa";
			for(int i = 0 ; i < n ; i++) {
				String check = br.readLine().trim();
				if(!words[i].equals(check)) {
					result = "Not Eyfa";
					break;
				}
			}
			
			bw.write(result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
