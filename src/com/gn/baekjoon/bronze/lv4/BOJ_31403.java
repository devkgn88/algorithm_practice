package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 31403
 * 문제명: A+B-C
 * 문제 링크: https://www.acmicpc.net/problem/31403
 */
public class BOJ_31403 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String a = br.readLine().trim();
			String b = br.readLine().trim();		
			String c = br.readLine().trim();
			bw.write(String.valueOf(change(a)+change(b)-change(c)));
			bw.newLine();
			bw.write(String.valueOf(change(a+b)-change(c)));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int change(String str) {
		return Integer.parseInt(str);
	}
}
