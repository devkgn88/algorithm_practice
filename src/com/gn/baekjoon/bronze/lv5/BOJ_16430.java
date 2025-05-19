package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 16430
 * 문제명: 제리와 톰
 * 문제 링크: https://www.acmicpc.net/problem/16430
 */
public class BOJ_16430 {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
        	String[] arr = br.readLine().trim().split("\\s+");
        	int a = Integer.parseInt(arr[0]);
        	int b = Integer.parseInt(arr[1]);
        	
        	int p = b-a;
        	int q = b; 
        	for(int i = 2 ; i <= p ; i++) {
        		if(p % i == 0 && q % i == 0) {
        			p /= i;
        			q /= i;
        		}
        	}
        	bw.write(p+" "+q);
        	bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
