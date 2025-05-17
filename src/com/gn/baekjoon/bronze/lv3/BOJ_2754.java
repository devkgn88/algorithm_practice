package com.gn.baekjoon.bronze.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 3
 * 문제 번호: 2754
 * 문제명: 학점계산
 * 문제 링크: https://www.acmicpc.net/problem/2754
 */
public class BOJ_2754 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
            char[] grade = br.readLine().trim().toCharArray();
            double result = 0.0;
        	switch(grade[0]) {
        		case 'A': result = 4.0;break;
        		case 'B': result = 3.0;break;
        		case 'C': result = 2.0;break;
        		case 'D': result = 1.0;break;
        	}
        	if(1 < grade.length) {
        		switch(grade[1]) {
        			case '+': result += 0.3;break;
        			case '-': result -= 0.3;break;
        		}	
        	}
            
            bw.write(String.valueOf(result));
        	bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
