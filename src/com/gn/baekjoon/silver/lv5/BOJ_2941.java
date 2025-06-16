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
			
			word = word.replace("c=", "5");
			word = word.replace("c-", "5");
			word = word.replace("dz=", "5");
			word = word.replace("d-","5");
			word = word.replace("lj", "5");
			word = word.replace("nj", "5");
			word = word.replace("s=", "5");
			word = word.replace("z=", "5");
			
			bw.write(String.valueOf(word.length()));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
