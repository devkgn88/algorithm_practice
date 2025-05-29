package com.gn.baekjoon.silver.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 레벨 : 실버 5 
 * 문제 번호: 1251
 * 문제명: 단어 나누기
 * 문제 링크: https://www.acmicpc.net/problem/1251
 */
public class BOJ_1251 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){

			String word = br.readLine().trim();
			int size = word.length();
			Set<String> set = new TreeSet<String>();

			for(int i = 1 ; i < size-2 ; i++) {
				for(int j = 1 ; j <= size-1-i ; j++) {
					StringBuffer str1 = new StringBuffer(word.substring(0, i));
					str1 = str1.reverse();
					StringBuffer str2 = new StringBuffer(word.substring(i, i+j));
					str2 = str2.reverse();
					StringBuffer str3 = new StringBuffer(word.substring(i+j, size));
					str3 = str3.reverse();
										
					str1 = str1.append(str2);
					str1 = str1.append(str3);
					
					set.add(str1.toString());
				}
			}
			
			Iterator<String> itr = set.iterator();
			int count = 0;
			while(itr.hasNext()) {
				bw.write(itr.next());
				count++;
				if(count == 1)break;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
