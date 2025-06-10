package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_18110 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			List<Integer> list = new ArrayList<Integer>();

			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < n ; i++) {
				int temp = Integer.parseInt(br.readLine().trim());
				list.add(temp);
			}
					
			Collections.sort(list);
			
			long num = Math.round(list.size()*0.15);
			
			for(int i = 0 ; i < num ; i++) {
				list.remove(0);
				list.remove(list.size()-1);
			}

			long sum = 0L;
			
			for(int i : list) {
				sum += i;
			}
			
			long avg = Math.round((double)sum / list.size());
			
			bw.write(String.valueOf(avg));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
