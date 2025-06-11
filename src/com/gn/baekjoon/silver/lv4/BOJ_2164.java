package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 레벨 : 실버4
 * 문제 번호: 2164
 * 문제명: 카드2
 * 문제 링크: https://www.acmicpc.net/problem/2164
 */
public class BOJ_2164 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			
			int n = Integer.parseInt(br.readLine().trim());
			
			Deque<Integer> d = new ArrayDeque<Integer>();
			
			for(int i = 1 ; i <= n ; i++) {
				d.offerLast(i);
			}
			
			while(true) {
				if(d.size() == 1) {
					bw.write(String.valueOf(d.pollFirst()));
					break;
				}
				d.pollFirst();
				d.offerLast(d.pollFirst());
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
