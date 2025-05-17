package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2475 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String[] arr = br.readLine().trim().split("\\s+");
			double sum = 0.0;
			for(String str : arr) {
				double d = Double.parseDouble(str);
				sum += Math.pow(d, 2.0);
			}
			int result = (int)(sum%10);
			bw.write(String.valueOf(result));
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
