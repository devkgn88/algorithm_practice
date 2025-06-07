package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_14626 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("");
			int leng = arr.length;
			
			int sum = 0;
			int idx = leng-1;
			int multi = 1;
			
			for(int i = 0 ; i < arr.length-1 ; i++) {
				if(arr[i].equals("*")) {
					idx = i;
					if(i%2 != 0) multi = 3;
				}else {
					if(i%2 == 0) {
						sum += Integer.parseInt(arr[i]);
					}else {
						sum += Integer.parseInt(arr[i])*3;
					}
				}
			}
			
			int result = 0;
			
			if(idx == leng-1) {
				if(sum % 10 == 0 ) {
					result = 0;
				}else {
					result = 10-(sum % 10);
					
				}
			} else {
				if(10-(sum%10) == Integer.parseInt(arr[leng-1])) {
					result = 0;
				}else {
					for(int i = 0 ; i <= 9 ; i++) {
						if((sum + (multi*i)) % 10 == Integer.parseInt(arr[leng-1])) {
							result = 10-i;
							break;
						}
					}
					
				}
			}
			
			bw.write(String.valueOf(result));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
						
	}
}
