package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 레벨 : 실버 4
 * 문제 번호: 4949
 * 문제명: 균형잡힌 세상
 * 문제 링크: https://www.acmicpc.net/problem/4949
 */
public class BOJ_4949 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			String line;
			
			
			while(!(line=br.readLine()).equals(".")) {
				
				String result = "yes";
				line = line.replace(".", "");
				
				Deque<Character> d = new ArrayDeque<Character>();
				for(char c : line.toCharArray()) {
					if(c == '(' || c == '[') {
						d.push(c);
					} else if( c == ')' || c == ']') {
						if(d.isEmpty()) {
							result = "no";
							break;
						}
						char open = d.pop();
						char close = c;

						if( ((open == '(' && close == ')') 
								|| (open == '[' && close == ']')) == false) {
							result = "no";
							break;
						}
					}
				}
				
				if(d.size() != 0) result = "no";
				
				bw.write(result);
				bw.newLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
