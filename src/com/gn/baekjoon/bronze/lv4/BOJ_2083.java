package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 2083
 * 문제명: 럭비 클럽
 * 문제 링크: https://www.acmicpc.net/problem/2083
 */
public class BOJ_2083 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String line;
			while(!(line=br.readLine().trim()).equals("# 0 0")) {
				String[] arr = line.split("\\s+");
				
				String name = arr[0];
				int age = Integer.parseInt(arr[1]);
				int weight = Integer.parseInt(arr[2]);
				
				bw.write(name+" ");
				if(age > 17 || weight >= 80) {
					bw.write("Senior");
				} else {
					bw.write("Junior");
				}
				bw.newLine();
				bw.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
