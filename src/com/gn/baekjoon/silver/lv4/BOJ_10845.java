package com.gn.baekjoon.silver.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BOJ_10845 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			Queue<Integer> q = new LinkedList<Integer>();
			Stack<Integer> s = new Stack<Integer>();
			
			int n = Integer.parseInt(br.readLine().trim());
			for(int i = 0 ; i < n ; i++) {
				String[] arr = br.readLine().trim().split("\\s+");
				switch(arr[0]) {
					case "push" : q.offer(Integer.parseInt(arr[1]));
									s.push(Integer.parseInt(arr[1]));break;
					case "front" : bw.write(q.peek()+"\n");break;
					case "back" : bw.write(s.peek()+"\n");break;
					case "size" : bw.write(q.size()+"\n");break;
					case "empty" : bw.write((q.isEmpty() ? "1" : "0")+"\n");break;
					case "pop" : 
						if(q.isEmpty()) {
							bw.write("-1"+"\n");
						}else {
							s.remove(0);
							bw.write(q.poll()+"\n");
						}break;
				}
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

