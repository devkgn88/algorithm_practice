package com.gn.baekjoon.bronze.lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 2
 * 문제 번호: 1978
 * 문제명: 소수 찾기
 * 문제 링크: https://www.acmicpc.net/problem/1978
 */
public class BOJ_1978 {
	public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
        	br.readLine();
        	String[] arr = br.readLine().trim().split("\\s+");
        	
        	int cnt = 0;
        	
        	for(String str : arr) {
        		int target = Integer.parseInt(str);
        		int check = 0;
        		for(int i = 1 ; i <= target ; i++) {
        			if(target % i == 0) check++;
        			if(2 < check) break;
        		}
        		if(check == 2) cnt++;
        	}
        	bw.write(String.valueOf(cnt));
        	bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
