package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 레벨 : 실버 5
 * 문제 번호: 10814
 * 문제명: 나이순 정렬
 * 문제 링크: https://www.acmicpc.net/problem/10814
 */
public class BOJ_10814 {
	
	static class Member{
		int age;
		String name;
		
		Member(){}
		Member(int age, String name){
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age+" "+name;
		}
	}
	
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			int n = Integer.parseInt(br.readLine().trim());
			List<Member> list = new ArrayList<Member>();
			
			for(int i = 0 ; i < n ; i++) {
				String[] info = br.readLine().trim().split("\\s+");
				Member member = new Member(Integer.parseInt(info[0]),info[1]);
				list.add(member);
			}
			
			Collections.sort(list, new Comparator<Member>(){
				@Override
				public int compare(Member m1, Member m2) {
					return Integer.compare(m1.age, m2.age);
				}
			});
			
			for(int i = 0 ; i < list.size() ; i++) {
				bw.write(list.get(i).toString());
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
