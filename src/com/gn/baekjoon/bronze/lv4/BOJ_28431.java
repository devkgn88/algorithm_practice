package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 28431
 * 문제명: 양말 짝 맞추기
 * 문제 링크: https://www.acmicpc.net/problem/28431
 */
public class BOJ_28431 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			Map<Integer,Integer> socks = new HashMap<Integer,Integer>();

			for(int i = 0 ; i < 5 ; i++) {
				int sock = Integer.parseInt(br.readLine().trim());
				if(!socks.containsKey(sock)) socks.put(sock, 1);
				else socks.put(sock, socks.get(sock)+1);
			}
			
			Set<Integer> keys = socks.keySet();
			for(int key : keys) {
				if(socks.get(key) % 2 != 0) {
					bw.write(String.valueOf(key));
					break;
				}
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
