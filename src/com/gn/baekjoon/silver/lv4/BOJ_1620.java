package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1620 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] temp = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(temp[0]);
			int m = Integer.parseInt(temp[1]);
			
			String[] arr = new String[n];
			for(int i = 0 ; i < arr.length ; i++) {
				String name = br.readLine().trim();
				arr[i] = name;
			}
			
			for(int i = 0 ; i < m ; i++) {
				Object o = br.readLine();
				if(o instanceof String) {
					for(int j = 0 ; j < arr.length ; j++) {
						if(arr[j].equals((String)o)) {
							bw.write((j+1)+"\n");
							break;
						}
					}
				} else {
					bw.write(arr[(int)o-1]+"\n");
				}
				bw.flush();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
