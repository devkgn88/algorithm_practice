package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 실버 5
 * 문제 번호: 2941
 * 문제명: 크로아티아 알파벳
 * 문제 링크: https://www.acmicpc.net/problem/2941
 */
public class BOJ_2941 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String word = br.readLine().trim();
			
			String[] arr = new String[] {"c=","c-","dz=","d-","lj","nj","s=","z="};
			
			for(String a : arr) {
				word = word.replace(a,"5");
			}
			
			bw.write(String.valueOf(word.length()));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
