package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 11367
 * 문제명: Report Card Time
 * 문제 링크: https://www.acmicpc.net/problem/11367
 */
public class BOJ_11367 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			
			List<Grade> list = new ArrayList<Grade>();
			list.add(new Grade(97,100,"A+"));
			list.add(new Grade(90,96,"A"));
			list.add(new Grade(87,89,"B+"));
			list.add(new Grade(80,86,"B"));
			list.add(new Grade(77,79,"C+"));
			list.add(new Grade(70,76,"C"));
			list.add(new Grade(67,69,"D+"));
			list.add(new Grade(60,66,"D"));
			list.add(new Grade(0,59,"F"));

			for(int i = 0 ; i < n ; i++) {
				String[] temp = br.readLine().trim().split("\\s+");
				int grade = Integer.parseInt(temp[1]);
				for(int j = 0 ; j < list.size() ; j++) {
					if(list.get(j).min <= grade && grade <= list.get(j).max) {
						bw.write(temp[0]+" "+list.get(j).alpha+"\n");
						break;
					}
				}
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static class Grade{
		int min;
		int max;
		String alpha;
		
		public Grade() {}
		
		public Grade(int min, int max, String alpha) {
			this.min = min;
			this.max = max;
			this.alpha = alpha;
		}
	}
}
