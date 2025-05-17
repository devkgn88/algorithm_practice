package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 11718
 * 문제명: 그대로 출력하기
 * 문제 링크: https://www.acmicpc.net/problem/11718
 */
public class BOJ_11718 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String line;
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
