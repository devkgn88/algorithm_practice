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
 * 문제 번호: 11650
 * 문제명: 좌표 정렬하기
 * 문제 링크: https://www.acmicpc.net/problem/11650
 */
public class BOJ_11650 {
	
	static class Point {
		int x,y;
		
		Point(){};
		Point(int x, int y){
			this.x = x; 
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){	
			
			int n = Integer.parseInt(br.readLine().trim());
			List<Point> list = new ArrayList<Point>();
			
			for(int i = 0 ; i < n ; i++) {
				String[] parts = br.readLine().trim().split("\\s+");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                list.add(new Point(x, y));
			}
			
			Collections.sort(list, new Comparator<Point>() {
				@Override
				public int compare(Point p1, Point p2) {
					int xCompare = Integer.compare(p1.x, p2.x);
					if(xCompare != 0) {
						return xCompare;
					}else {
						return Integer.compare(p1.y, p2.y);
					}
				}
			});
			
			for(Point p : list) {
				bw.write(p.x+" "+p.y);
				bw.newLine();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
