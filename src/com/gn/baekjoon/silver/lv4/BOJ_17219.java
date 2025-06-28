package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 레벨 : 실버 4
 * 문제 번호: 17219
 * 문제명: 비밀번호 찾기
 * 문제 링크: https://www.acmicpc.net/problem/17219
 */
public class BOJ_17219 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			Map<String,String> map = new HashMap<String,String>();
			for(int i = 0 ; i < n ; i++) {
				String[] temp = br.readLine().trim().split("\\s+");
				map.put(temp[0], temp[1]);
			}
			
			for(int i = 0 ; i < m ; i++) {
				String str = br.readLine().trim();
				bw.write(map.get(str)+"\n");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
