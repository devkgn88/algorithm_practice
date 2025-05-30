package com.gn.baekjoon.bronze.lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 4
 * 문제 번호: 14470
 * 문제명: 전자레인지
 * 문제 링크: https://www.acmicpc.net/problem/14470
 */
public class BOJ_14470 {
	public static void main(String[] args) {
		// a도 -> b도
		// temp < 0 : 얼어있음
		// temp > 0 : 얼어있지 않음
		// temp = 0 : 얼어 아니 몰라
		
		// froz == true && temp < 0 -> c초에 1씩 오름
		// froz == true && temp == 0 -> 해동하는데 d초가 걸림
		// forz == false -> e초에 1도씩 오름
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			int a = Integer.parseInt(br.readLine().trim());	// 원래 온도
			int b = Integer.parseInt(br.readLine().trim());	// 목표 온도
			int c = Integer.parseInt(br.readLine().trim());	// 고기 1도 데우는데 걸리는 시간
			int d = Integer.parseInt(br.readLine().trim());	// 고기 해동하는데 걸리는 시간
			int e = Integer.parseInt(br.readLine().trim());	// 얼어있지X 고기 1도 데우는데
			
			// 고기를 B도로 데우는데 걸리는 시간
			boolean froz = false;
			if(a < 0) froz = true;
			
			int time = 0;
			
			while(true) {
				
				if(froz == true && a < 0) {
					time += c;
					a += 1;
				}else if(froz == true && a == 0) {
					time += d;
					froz = false;
				}else if(froz == false) {
					time += e;
					a += 1;
				}
				
				if(a == b) break;
			}
			
			bw.write(String.valueOf(time));
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
