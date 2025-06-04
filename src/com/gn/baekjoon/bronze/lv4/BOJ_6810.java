package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 6810
 * 문제명: ISBN
 * 문제 링크: https://www.acmicpc.net/problem/6810
 */
public class BOJ_6810 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			StringBuilder sb = new StringBuilder("9780921418");
			for(int i = 0 ; i < 3 ; i++) {
				String str = br.readLine().trim();
				sb.append(str);
			}
			
			int sum = 0 ;
			
			for(int i = 0 ; i < sb.length() ; i++) {
				int num = Integer.parseInt(sb.charAt(i)+"");
				if(i % 2 == 0) {
					sum += num;
				}else {
					sum += 3*num;
				}
			}

			bw.write("The 1-3-sum is "+String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
