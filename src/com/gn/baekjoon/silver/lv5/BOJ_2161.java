package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 레벨 : 실버 5
 * 문제 번호: 2161
 * 문제명: 카드 1
 * 문제 링크: https://www.acmicpc.net/problem/2161
 */
public class BOJ_2161 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			
			Deque<Integer> d = new ArrayDeque<Integer>();
			
			for(int i = 1 ; i <= n ; i++) {
				d.offerLast(i);
			}
			
			while (d.size() > 1) {
                bw.write(d.pollFirst() + " ");
                d.offerLast(d.pollFirst());
            }

            bw.write(String.valueOf(d.pollFirst()));
            bw.flush();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
