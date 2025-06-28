package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 레벨 : 실버 4
 * 문제 번호: 11399
 * 문제명: ATM
 * 문제 링크: https://www.acmicpc.net/problem/11399
 */
public class BOJ_11399 {
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			String[] arr = br.readLine().trim().split("\\s+");
			
			List<Person> list = new ArrayList<Person>();
			for(int i = 1 ; i <= n ; i++) {
				int minute = Integer.parseInt(arr[i-1]);
				list.add(new Person(i,minute));
			}
			Collections.sort(list,new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {
					return Integer.compare(p1.time, p2.time);
				}
			});
			
			int time = 0;
			int sum = 0;
			for(int i = 0 ; i < list.size() ; i++) {
				time += list.get(i).time;
				sum += time;
			}
			
			bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static class Person{
		int order;
		int time;
		
		public Person() {}
		
		public Person(int order, int time) {
			this.order = order;
			this.time = time;
		}
	}
}
