package com.gn.baekjoon.bronze.lv5;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * 레벨 : 브론즈 5
 * 문제 번호: 14645
 * 문제명: 와이버스 부릉부릉
 * 문제 링크: https://www.acmicpc.net/problem/14645
 */
public class BOJ_14645 {
	public static void main(String[] args) {
		try (
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
			bw.write("비와이");
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
