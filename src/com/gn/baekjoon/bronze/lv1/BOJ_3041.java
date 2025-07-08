package com.gn.baekjoon.bronze.lv1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 레벨 : 브론즈 1
 * 문제 번호: 3041
 * 문제명: N-퍼즐
 * 문제 링크: https://www.acmicpc.net/problem/3041
 */
public class BOJ_3041 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			Map<Character, Point> map = new HashMap<Character,Point>();
			map.put('A', new Point(0,0));
			map.put('B', new Point(0,1));
			map.put('C', new Point(0,2));
			map.put('D', new Point(0,3));
			map.put('E', new Point(1,0));
			map.put('F', new Point(1,1));
			map.put('G', new Point(1,2));
			map.put('H', new Point(1,3));
			map.put('I', new Point(2,0));
			map.put('J', new Point(2,1));
			map.put('K', new Point(2,2));
			map.put('L', new Point(2,3));
			map.put('M', new Point(3,0));
			map.put('N', new Point(3,1));
			map.put('O', new Point(3,2));
			
			int sum = 0;
			
			for(int i = 0 ; i < 4 ; i++) {
				char[] arr = br.readLine().trim().toCharArray();
				for(int j = 0 ; j < 4 ; j++) {
					if(arr[j] != '.') {
						Point origin = map.get(arr[j]);
						sum += Math.abs((origin.x -i))+Math.abs((origin.y -j));
					}
				}
			}
			
			bw.write(String.valueOf(sum));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x; 
			this.y = y;
		}
	}
}
