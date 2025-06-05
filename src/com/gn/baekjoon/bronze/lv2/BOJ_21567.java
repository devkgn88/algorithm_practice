package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 21567
 * 문제명: 숫자의 개수2
 * 문제 링크: https://www.acmicpc.net/problem/21567
 */
public class BOJ_21567 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			BigInteger a = new BigInteger(br.readLine().trim());
			BigInteger b = new BigInteger(br.readLine().trim());
			BigInteger c = new BigInteger(br.readLine().trim());
			
			int[] arr = new int[10];

			BigInteger multiple = a.multiply(b).multiply(c);

			while(true) {
				int num = multiple.remainder(new BigInteger("10")).intValue();
				arr[num] += 1;
				multiple = multiple.divide(new BigInteger("10"));
				if(multiple.equals(new BigInteger("0"))) break;
			}
			
			for(int num : arr) {
				bw.write(String.valueOf(num));
				bw.newLine();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
