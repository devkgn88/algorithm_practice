package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 4999
 * 문제명: 아!
 * 문제 링크: https://www.acmicpc.net/problem/4999
 */
public class BOJ_4999 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String sound1 = br.readLine().trim();
			String sound2 = br.readLine().trim();
			
			if(sound1.contains(sound2)) {
				bw.write("go");
			}else {
				bw.write("no");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
