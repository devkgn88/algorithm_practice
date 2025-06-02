package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2164 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			List<Integer> list = new ArrayList<Integer>();
			
			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 1 ; i <= n ; i++) {
				list.add(i);
			}
			
			while(list.size() != 1) {
				list.remove(0);
				int temp = list.get(0);
				list.remove(0);
				list.add(temp);
			}
			
			bw.write(String.valueOf(list.get(0)));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
