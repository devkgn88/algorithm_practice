package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 2744
 * 문제명: 대소문자 바꾸기
 * 문제 링크: https://www.acmicpc.net/problem/2744
 */
public class BOJ_2744 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			String str = br.readLine().trim();
			char[] arr = str.toCharArray();
			for(int i = 0 ; i < arr.length ; i++) {
				int target = (int)arr[i];
				if(97 <= target && target <= 122) {
					bw.write((char)(target-32));
				} else if(65 <= target && target <= 90) {
					bw.write((char)(target+32));;
				}
			}
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
