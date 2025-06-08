package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 2480
 * 문제명: 주사위 세개
 * 문제 링크: https://www.acmicpc.net/problem/2480
 */
public class BOJ_2480 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			String[] arr = br.readLine().trim().split("\\s+");
			
			int[] dice = new int[7];
			for(int i = 0 ; i < arr.length ; i++) {
				int temp = Integer.parseInt(arr[i]);
				dice[temp] += 1;
			}
			
			int result = 0;
			int max = 0;
			
			for(int i = 1 ; i < dice.length ; i++) {
				if(dice[i] == 3) {
					result  = 10000 + (i*1000);
					break;
				}else if(dice[i] == 2) {
					result  = 1000 + (i*100);
					break;
				}else if(dice[i] == 1 && dice[i] > max) {
					result  = i*100;
				}
			}
			
			bw.write(String.valueOf(result));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
