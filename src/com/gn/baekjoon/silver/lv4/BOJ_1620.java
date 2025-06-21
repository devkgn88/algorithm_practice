package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BOJ_1620 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] temp = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(temp[0]);
			int m = Integer.parseInt(temp[1]);

			List<String> list = new ArrayList<String>();
			
			for(int i = 0 ; i < n ; i++) {
				String name = br.readLine().trim();
				list.add(name);
			}
			
			for(int i = 0 ; i < m ; i++) {
				int num = 0 ;
				String str = null;
				try {
					str = br.readLine().trim();
					num = Integer.parseInt(str);
					bw.write(String.valueOf(list.get(num-1))+"\n");
				}catch(NumberFormatException e) {
					bw.write(String.valueOf(list.indexOf(str)+1)+"\n");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
