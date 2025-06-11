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
 * 문제 번호: 11651
 * 문제명: 좌표 정렬하기 2
 * 문제 링크: https://www.acmicpc.net/problem/11651
 */
public class BOJ_11651 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int n = Integer.parseInt(br.readLine().trim());
			List<Point> list = new ArrayList<Point>();
			
			for(int i = 0 ; i < n ; i++) {
				String[] temp = br.readLine().trim().split("\\s+");
				int x = Integer.parseInt(temp[0]);
				int y = Integer.parseInt(temp[1]);
				
				list.add(new Point(x,y));
			}
			
			Collections.sort(list, new Comparator<Point>(){
				@Override
				public int compare(Point p1, Point p2) {
					int result = Integer.compare(p1.y,p2.y);
					if(result == 0) {
						result = Integer.compare(p1.x, p2.x);
					}
					return result;
				}
			});
			
			for(Point p : list) {
				bw.write(p.toString());
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static class Point{
		int x;
		int y;
		
		Point() {}
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public String toString() {
			return x+" "+y;
		}
	}
}
