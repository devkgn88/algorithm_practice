package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 레벨 : 실버 4
 * 문제 번호: 10845
 * 문제명: 큐
 * 문제 링크: https://www.acmicpc.net/problem/10845
 */
public class BOJ_10845 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			Deque<Integer> d = new ArrayDeque<Integer>();
	
			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < n ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				switch(arr[0]) {
					case "push" : d.offer(Integer.parseInt(arr[1]));break;
					case "front" : bw.write((d.isEmpty() ? "-1" : d.getFirst())+"\n");break;
					case "back" : bw.write((d.isEmpty() ? "-1" : d.getLast())+"\n");break;
					case "size" : bw.write(d.size()+"\n");break;
					case "empty" : bw.write((d.isEmpty() ? "1" : "0")+"\n");break;
					case "pop" : bw.write((d.isEmpty() ? "-1" : d.poll())+"\n");
				}
			}	
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

