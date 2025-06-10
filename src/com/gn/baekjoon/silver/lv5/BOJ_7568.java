package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 레벨 : 실버 5
 * 문제 번호: 7568
 * 문제명: 덩치
 * 문제 링크: https://www.acmicpc.net/problem/7568
 */
public class BOJ_7568 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
		
			int n = Integer.parseInt(br.readLine().trim());
			
			List<Person> list = new ArrayList<Person>();
			
			for(int i = 0 ; i < n ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				int weight = Integer.parseInt(arr[0]);
				int height = Integer.parseInt(arr[1]);
				list.add(new Person(weight,height));
			}
			
			for (int i = 0; i < n; i++) {
				int rank = 1;
				for (int j = 0; j < n; j++) {
					if (i == j) continue;
					if (list.get(j).weight > list.get(i).weight &&
						list.get(j).height > list.get(i).height) {
						rank++;
					}
				}
				bw.write(rank + " ");
			}

			bw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static class Person{
		int weight;	// 몸무게
		int height;	// 키
		
		Person(){}
		
		Person(int weight, int height){
			this.weight = weight;
			this.height = height;
		}
	}
}
