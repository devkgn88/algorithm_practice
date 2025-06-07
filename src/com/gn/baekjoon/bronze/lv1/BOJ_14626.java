package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class BOJ_14626 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("");
			int leng = arr.length;
			
			int result = 0;
			
			if(arr[leng-1].equals("*")) {
				BigInteger sum = new BigInteger("0");
				for(int i = 0 ; i < leng-1 ; i++) {
					if(i%2==0) {
						sum = sum.add(new BigInteger(arr[i]));
					}else {
						sum = sum.add(new BigInteger(arr[i]).multiply(new BigInteger("3")));
					}
				}
				sum = sum.mod(new BigInteger("10"));
				result = 10 - sum.intValue();
			}else {
				BigInteger rest = new BigInteger("10").subtract(new BigInteger(arr[leng-1]));
				int multi = 1;
				BigInteger sum = new BigInteger("0");
				
				for(int i = 0 ; i < leng-1 ; i++) {
					if(arr[i].equals("*")) {
						if(i%2 !=0) multi = 3;
					}else {
						if(i%2==0) {
							sum = sum.add(new BigInteger(arr[i]));
						}else {
							sum = sum.add(new BigInteger(arr[i]).multiply(new BigInteger("3")));
						}
					}
				}

				for(int i = 0 ; i <= 9 ; i++) {
					BigInteger gob = new BigInteger(String.valueOf(multi*i));
					BigInteger temp = sum.add(gob);
					
					if(temp.remainder(new BigInteger("10")).compareTo(rest) == 0) {
						result = i;
						break;
					}
				}
			}
			
			bw.write(String.valueOf(result));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
						
	}
}
