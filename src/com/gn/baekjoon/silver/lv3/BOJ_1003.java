package com.gn.baekjoon.silver.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1003 {
	
	public static int a = 0 ;
	public static int b = 0;
	
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int t = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < t ; i ++) {
				int num = Integer.parseInt(br.readLine().trim());
				fibonacci(num);
				bw.write(a+" "+b+"\n");
				a = 0;
				b = 0; 
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

	public static int fibonacci(int n) {
		if(n == 0) {
			a += 1;
			return 0;
		} else if(n == 1) {
			b += 1;
			return 1; 
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
