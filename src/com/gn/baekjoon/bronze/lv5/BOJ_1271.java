package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 1271
 * 문제명: 엄청난 부자2
 * 문제 링크: https://www.acmicpc.net/problem/1271
 */
public class BOJ_1271 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			BigInteger n = new BigInteger(arr[0]);
			BigInteger m = new BigInteger(arr[1]);
			
			bw.write(String.valueOf(n.divide(m)));
			bw.newLine();
			bw.write(String.valueOf(n.remainder(m)));
			bw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
