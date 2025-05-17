package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 레벨 : 브론즈 2 
 * 문제 번호: 10809
 * 문제명: 알파벳 찾기
 * 문제 링크: https://www.acmicpc.net/problem/10809
 */
public class BOJ_10809 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			char[] word = br.readLine().trim().toCharArray();
			for(int i = 0 ; i < word.length ; i++) {
				if(!map.containsKey((int)word[i]))map.put((int)word[i], i);
			}
			
			for(int i = 97 ; i <= 122 ; i++) {
				if(map.containsKey(i)) bw.write(String.valueOf(map.get(i)));
				else bw.write(String.valueOf(-1));
				bw.write(" ");
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
