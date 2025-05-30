package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2798 {
	public static void main(String[] args) {
		// 5 21
		// 5 6 7 8 9
		
		// 0 1 2 3 4
		
		// 0 1 2
		// 0 1 3
		// 0 1 4
		// 0 2 3
		// 0 2 4
		// 0 3 4
		
		// 1 2 3
		// 1 2 4
		// 1 3 4
		
		// 2 3 4
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			String[] num = br.readLine().trim().split("\\s+");
			
			int sum = 0;
			
			Loop1 : 
			for(int a = 0 ; a <= n-3 ; a++ ) {
				Loop2 : 
				for(int b = 1 ; b <= n-2 ; b++) {
					Loop3 : 
					for(int c = 2 ; c <= n-1 ; c++) {
						if(a < b && b < c) {
							int temp = Integer.parseInt(num[a])
									+ Integer.parseInt(num[b])
									+ Integer.parseInt(num[c]);
							if(m < temp) break Loop1; 
							
							if(m-temp < m-sum) {
								sum = temp;
							}
						}
					}
				}
			}
			
			bw.write(String.valueOf(sum));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
