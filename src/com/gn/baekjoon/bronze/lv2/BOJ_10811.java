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
			
			StringBuilder basket = new StringBuilder("");
			for(int a = 1 ; a <= n ; a++) {
				basket.append(a);
			}
			
			for(int a = 0 ; a < m ; a++) {
				
				String[] arr = br.readLine().trim().split("\\s+");
				
				int i = Integer.parseInt(arr[0]);
				int j = Integer.parseInt(arr[1]);
				
				StringBuilder potion = new StringBuilder("");
				potion.append(basket.substring(i-1, j));
				potion.reverse();
				
				basket.delete(i-1, j);
				basket.insert(i-1, potion);
			}
			
			for(int i = 0 ; i < basket.length() ; i++) {
				bw.write(basket.charAt(i));
				if(i+1 == basket.length()) break;
				bw.write(" ");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
