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
			
			int alpha = 65;
			for(int i = 0 ; i < 4; i++) {
				for(int j = 0 ; j < 4 ; j++) {
					if(65 <= alpha && alpha <= 79) {
						map.put((char)alpha, new Point(i,j));
						alpha++;
					}
				}
			}
			
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
