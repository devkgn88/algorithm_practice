package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 1076
 * 문제명: 저항
 * 문제 링크: https://www.acmicpc.net/problem/1076
 */
public class BOJ_1076 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			String num = "";
			for(int i = 0 ; i < 2 ; i++) {
				int temp = findIdx(br.readLine().trim());
				num += temp;
			}
			
			long multi = Integer.parseInt(num) * (long)Math.pow(10, findIdx(br.readLine().trim()));
			bw.write(String.valueOf(multi));
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static int findIdx(String str) {
		String[] arr = {"black","brown","red","orange","yellow"
				,"green","blue","violet","grey","white"};
		
		int result = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(str.equals(arr[i])) {
				result = i;
				break;
			}
		}
		return result;
	}
}
