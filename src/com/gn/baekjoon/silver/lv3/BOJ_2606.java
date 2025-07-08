package com.gn.baekjoon.silver.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2606 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int c = Integer.parseInt(br.readLine().trim());
			
			int line = Integer.parseInt(br.readLine().trim());
			
			int[][] arr = new int[c][c];
			
			for(int i = 0 ; i < line ; i++) {
				char[] temp = br.readLine().trim().toCharArray();
				int a = temp[0]-'0';
				int b = temp[2]-'0';
				System.out.println(a+" : "+b);
				if(a < b) {
					arr[a-1][b-1] = 1;
				} else {
					arr[b-1][a-1] = 1;
				}
			}
			
			for(int i = 0 ; i < c ; i++) {
				if(arr[0][i] == 1) {
					
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
