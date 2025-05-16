package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2743 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String str = br.readLine();
			int length = str.length();
			bw.write(String.valueOf(length));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
