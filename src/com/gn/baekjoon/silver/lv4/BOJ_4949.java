package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

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
				
				bw.write(result);
				bw.newLine();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
