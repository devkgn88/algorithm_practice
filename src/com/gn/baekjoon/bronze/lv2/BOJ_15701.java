package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class BOJ_15701 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			long n = Integer.parseInt(br.readLine().trim());
			long result = 0;
			Set<Long> set = new HashSet<Long>();
			
			for(long i = 1 ; i <= n; i++) {
				if(n % i == 0) {
					if(set.contains(i)) {
						break; 
					}
					
					if(i * i == n) {
						result += 1;
					} else {
						result += 2;
					}
					
					set.add(i);
					set.add((long)(n/i));
				
				}
				
				
			}
			bw.write(String.valueOf(result));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
