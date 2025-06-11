package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 2 
 * 문제 번호: 15829
 * 문제명: Hashing
 * 문제 링크: https://www.acmicpc.net/problem/15829
 */
public class BOJ_15829 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int l = Integer.parseInt(br.readLine().trim());
			String str = br.readLine().trim();
			
			BigInteger result = new BigInteger("0");
			
			for(int i = 0 ; i < l ; i++) {
				
				BigInteger word = BigInteger.valueOf((int)str.charAt(i)-96);
				BigInteger pow = new BigInteger("31").pow(i);
				pow = pow.multiply(word);
				result = result.add(pow);
			}
			
			result = result.mod(new BigInteger("1234567891"));
			
			bw.write(String.valueOf(result));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
