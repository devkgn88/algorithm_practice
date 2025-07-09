package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 1264
 * 문제명: 모음의 개수
 * 문제 링크: https://www.acmicpc.net/problem/1264
 */
public class BOJ_1264 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String line;
			while(!(line=br.readLine().trim()).equals("#")) {
				line = line.toLowerCase();
				int leng1  = line.length();
				line = line.replaceAll("[aeiou]", "");
				int leng2 = line.length();
				bw.write((leng1-leng2)+"\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
