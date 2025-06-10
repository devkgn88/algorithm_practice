package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10811 {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] temp = br.readLine().trim().split("\\s+");
			
			int n = Integer.parseInt(temp[0]);
			int m = Integer.parseInt(temp[1]);
			
			StringBuilder sb = new StringBuilder("");
			for(int a = 1 ; a <= n ; a++) {
				sb.append(a+"");
			}
			
			for(int a = 0 ; a < m ; a++) {
				String[] arr = br.readLine().trim().split("\\s+");
				int i = Integer.parseInt(arr[0]);
				int j = Integer.parseInt(arr[1]);
				
				StringBuilder x = new StringBuilder(sb.substring(i-1, j));
				StringBuilder y = sb.replace(i-1, j, "");

				
				x.reverse();
				sb.insert(i-1, x);
			}
			
			for(int a = 0 ; a < sb.length() ; a++) {
				bw.write(sb.charAt(a)+" ");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
