package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 레벨 : 실버 4
 * 문제 번호: 1764
 * 문제명: 듣보잡
 * 문제 링크: https://www.acmicpc.net/problem/1764
 */
public class BOJ_1764 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String[] arr = br.readLine().trim().split("\\s+");
			
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			
			Set<String> listen = new HashSet<String>();
			Set<String> see = new TreeSet<String>();
			
			for(int i = 0 ; i < n ; i++) {
				listen.add(br.readLine().trim());
			}
			
			for(int i = 0 ; i < m ; i ++) {
				String person = br.readLine().trim();
				if(listen.contains(person)) {
					see.add(person);
				}
			}
				
			
			Iterator<String> itr = see.iterator();
			bw.write(see.size()+"\n");
			while(itr.hasNext()) {
				String person = itr.next();
				bw.write(person+"\n");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
